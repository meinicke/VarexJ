//
// Copyright (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
//
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.util.json;

import gov.nasa.jpf.JPFException;

/**
 * JSON parser. Read tokenized stream from JSONTokenizer and returns root JSON
 * node.
 * Parser read extended JSON grammar (http://json.org).
 * Standard grammar was extended by ability to set Choice Generator call as a
 * value in JSON object.
 * @author Ivan Mushketik
 */
public class JSONParser {

  JSONLexer lexer;
  // Last token returned by lexer
  Token lastReadToken;
  
  Token prevReadToken;
  // true if parser bactracked to previous token
  int backtrack;

  public JSONParser(JSONLexer lexer) {
    this.lexer = lexer;
  }

  /**
   * Parse JSON document
   * @return root node of JSON tree.
   */
  public JSONObject parse() {
    return parseObject();
  }

  /**
   * Read next token from lexer output stream. If parser backtraced return previously
   * read token
   * @return
   */
  private Token next() {
    if (lastReadToken != null && lastReadToken.getType() == Token.Type.DocumentEnd) {
      return lastReadToken;
    }

    if (backtrack == 1) {
      backtrack--;
      return lastReadToken;
    }

    if (backtrack == 2) {
      backtrack--;
      return prevReadToken;
    }

    prevReadToken = lastReadToken;
    lastReadToken = lexer.getNextToken();

    return lastReadToken;
  }

  /**
   * Backtrack to previous token
   */
  private void back() {
    if (backtrack == 2) {
      throw new JPFException("Attempt to bactrack three times. Posibly an error. Please report");
    }

    if (lastReadToken == null) {
      throw new JPFException("Attempt to backtrack before starting to read token stream. Please report");
    }

    if (backtrack == 1 && prevReadToken == null) {
      throw new JPFException("Attempt to backtrack twice when less then two tokens read. Please report");
    }

    backtrack++;
  }

  /**
   * Read next token and check it's type. If type is wrong method throws exception
   * else it returns read token
   * @param type - type of the following token.
   * @return read token if it has correct type
   */
  private Token consume(Token.Type type) {
    Token t = next();

    if (t.getType() != type) {
      error("Unexpected token '" + t.getValue() + "' expected " + type);
    }

    return t;
  }

  /**
   * Parse JSON object
   * @return
   */
  private JSONObject parseObject() {
    JSONObject pn = new JSONObject();
    consume(Token.Type.ObjectStart);  
    Token t = next();

    // Check if object is empty
    if (t.getType() != Token.Type.ObjectEnd) {
      back();
      while (true) {
        Token key = consume(Token.Type.String);
        consume(Token.Type.KeyValueSeparator);
        

        Token posibleId = next();
        t = next();

        if (posibleId.getType() == Token.Type.Identificator &&
            t.getType() == Token.Type.CGCallParamsStart) {
            CGCall cg = parseCGCall(posibleId.getValue());
            pn.addCGCall(key.getValue(), cg);
        } else {
          back();
          back();
          Value v = parseValue();
          pn.addValue(key.getValue(), v);
        }

        t = next();
        // If next token is comma there is one more key-value pair to read
        if (t.getType() != Token.Type.Comma) {
          back();
          break;
        }
      }
      consume(Token.Type.ObjectEnd);
    }
    return pn;
  }

  /**
   * Parse array of JSON objects
   * @return parsed array of JSON objects
   */
  private ArrayValue parseArray() {
    consume(Token.Type.ArrayStart);
    ArrayValue arrayValue = new ArrayValue();
    Token t = next();
    if (t.getType() != Token.Type.ArrayEnd) {
      back();
      while (true) {
        Value val = parseValue();
        arrayValue.addValue(val);

        t = next();
        // If next token is comma there is one more object to parse
        if (t.getType() != Token.Type.Comma) {
          back();
          break;
        }
      }
    } else {
      back();
    }
    consume(Token.Type.ArrayEnd);
    
    return arrayValue;
  }

  /**
   * Parse identifier. Identifier can be "null", "true" or "false"
   * @return appropriate value object
   */
  private Value parseIdentificator() {
    Token id = consume(Token.Type.Identificator);

    String val = id.getValue();
    if (val.equals("true")) {
      return new BooleanValue(true, "true");

    } else if (val.equals("false")) {
      return new BooleanValue(false, "false");
      
    } else if (val.equals("null")) {
      return new NullValue();
    }

    error("Unknown identifier");
    return null;
  }

  private void error(String string) {
    throw new JPFException(string + "(" + lexer.getLineNumber() + ":" + lexer.getCurrentPos() + ")");
  }

  private Value parseValue() {
    Token t = next();
    switch (t.getType()) {
      case Number:
        return new DoubleValue(t.getValue());
        
      case String:
        return new StringValue(t.getValue());
        
      case ArrayStart:
        back();
        return parseArray();
        
      case ObjectStart:
        back();
        return new JSONObjectValue(parseObject());
        
      case Identificator:
        back();
        return parseIdentificator();
        
      default:
        error("Unexpected token '" + t.getValue() + "' during parsing JSON value");
        return null;
    }
    
  }

  /**
   * Parse Choice Generator call
   * @param cgName - name of called Choice Generator.
   * @return parsed object with info about Choice Generator call
   */
  private CGCall parseCGCall(String cgName) {
    
    CGCall parsedCG = new CGCall(cgName);
    Token t = next();

    if (t.getType() != Token.Type.CGCallParamsEnd) {
      back();
      while (true) {
        Value v = parseValue();
        parsedCG.addParam(v);

        t = next();
        if (t.getType() == Token.Type.CGCallParamsEnd) {
          back();
          break;
        }
        back();
        consume(Token.Type.Comma);
      }
    } else {
      back();
    }

    consume(Token.Type.CGCallParamsEnd);

    return parsedCG;
  }
}
