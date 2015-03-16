[![Build Status](https://travis-ci.org/chupanw/VarexJ.svg?branch=master)](https://travis-ci.org/chupanw/VarexJ)

# Overview

VarexJ is a variability-aware interpreter for Java(7) bytecode based on Java Pathfinder v7.0 (rev 1155+) see: http://javapathfinder.sourceforge.net/.

JDK 7 is required.


# Build:

Import the project into eclipse.

If it does not build automatically, right-click on the build.xml \ run as \ Ant BUild
The build process has to be run with JDK 7, JRE will not work.


# Configuration:

define global options with site.properties @ ../home/.jpf/site.properties
content:

	jpf-core=C:/Users/Loaner/workspace/jpf-core-vai (path to the project)
	tc-home=${jpf-core}/lib
	native_classpath = ${tc-home}/featureexprlib_2.10-0.3.4.jar;${tc-home}/scala-library-2.10.3.jar;${tc-home}/org.sat4j.core-2.3.1.jar


# JPF options:

It is required to disable path search (e.g., BFS)! Set search class:  
`search.class=.search.RandomSearch`

Variability-Aware options:

* set feature expression [SAT, BDD]
	`factory=BDD`
* set choice type [TreeChoice, MapChoice]
	`choice=TreeChoice`
* define constraints of the application with a dimacs file can be created with FeatureIDE (http://fosd.net/fide):
	`featuremodel="path"\model.dimacs`
* set method frame [StackHandler] (currently only one type supported)

# Specify conditional boolean fields

	import gov.nasa.jpf.annotation.Conditional;

	@Conditional
	static FEATURE = true;

FEATURE is used as if it has both values true and false. 

# Run VarexJ:

a) as test: see test package "cmu.*", it contains several examples for variability-aware execution

b) as JVM via command line:

`java -jar ..\RunJPF.jar +native_classpath=.."path to VarexJ"\lib\* +search.class=.search.RandomSearch +featuremodel="path to the feature model"\model.dimacs +choice=TreeChoice +factory=BDD +classpath="path to the application"\bin\ A.B.Main args `


