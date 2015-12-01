/* 
 * Copyright (C) 2013  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

import com.google.api.GoogleAPI;
import com.google.api.translate.Language;
import com.google.api.translate.Translate;

public class GoogleTranslator {
  public static void main (String[] args) throws Exception {
    // Replace link with the HTTP referrer to your website address
    GoogleAPI.setHttpReferrer("link");

    // Replace key with the Google Translate API key
    GoogleAPI.setKey("key");

    // Do the translation
    String translatedText = Translate.DEFAULT.execute("Hello world", Language.ENGLISH, Language.FRENCH);

    System.out.println(translatedText);
  }
}
