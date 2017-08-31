[![Build Status](https://travis-ci.org/meinicke/VarexJ.svg?branch=master)](https://travis-ci.org/meinicke/VarexJ)

# Overview

VarexJ is a variability-aware interpreter for Java(8) bytecode based on Java Pathfinder v7.0 (rev 1155+) see: http://javapathfinder.sourceforge.net/.

JDK 8 is required.

# Build:

Import the project into eclipse.

Use gradle to build the project (e.g., ./gradlew build)

Within Eclipse you can use the gradle plugin: https://github.com/spring-projects/eclipse-integration-gradle/

* On the "build.gradle" file Run as/Gradle build... Specify "build" at the Gradle Tasks page and press run
* You may need to generate eclipse project files: Specify "eclipse" at the Gradle Tasks page


# JPF options:

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

c) using a main method:

	public static void main(String[] _) {
		String path = "C:/Project/";
		String[] args = {
			"+classpath=" + path + "bin",
			"+search.class=.search.RandomSearch",
			"+featuremodel=" + path + "model.dimacs", 
			"Main"
		};
		JPF.main(args);
	}
