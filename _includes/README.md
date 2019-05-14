VarexJ
======

Highly-configurable systems allow users to achieve their specific needs. Such software systems are flexible, but come with difficulties for program analyses, as it is usually not possible to test all combinations of options separately due to the configuration space explosion.  Variability-aware approaches exploit redundancies among configurations to share analysis efforts. Variability-aware execution aggressively shares computations and data in program execution across multiple configurations, for example, when executing a test over all configurations. By maximizing sharing, the approach can outperform traditional approaches by orders of magnitude on many highly-configurable systems, without falling back to incomplete sampling strategies.  We investigate and evaluate the impact of interactions on sharing and scalability to current testing approaches using several small benchmark programs. We show that sharing reduces the number of executed instructions significantly, while the effort to execute them usually stays low. We applied VarexJ to several larger real-world applications to  illustrate typical sharing potential in real-world applications. Finally, we found that options high interact on data in these systems, but only local, orthogonal and rare.

VarexJ is based on [JavaPathfinder](http://javapathfinder.sourceforge.net/) v7.0 (rev 1155+).

# Usage

## Build

Use gradle to build the project (e.g., ./gradlew build)

Within Eclipse you can use the gradle plugin: [gradle](https://github.com/spring-projects/eclipse-integration-gradle/)

* On the "build.gradle" file Run as/Gradle build... Specify "build" at the Gradle Tasks page and press run
* You may need to generate eclipse project files: Specify "eclipse" at the Gradle Tasks page.

## VarexJ options

* set feature expression [SAT, BDD]:
	`factory=BDD`
* set choice type [TreeChoice, MapChoice]:
	`choice=TreeChoice`
* define constraints of the application with a dimacs file (can be created with [FeatureIDE](http://fosd.net/fide)):
	`featuremodel="path"\model.dimacs`
* define whether a method call on multiple opjects (i.e., Choice(Feature, Object1, Object2)) of the same type should be shared:
	`invocation=true`

## Specify conditional boolean fields
<a href="/resources/VarexJ/Example/trace.png"><img align="right" alt="VAriability-Aware Trace" src="/resources/VarexJ/Example/trace.png" height="368"/></a>

	import gov.nasa.jpf.annotation.Conditional;

	@Conditional
	static A = true;
	@Conditional
	static B = true;
	
	void run() {
		int i = 0;
		i = i + 2;
		if (A) {
			i++; 
		}
		i = i * 2;
		if (B) {
			i = deci(i);
		}
		i = i - 1;
	}
	int deci(int k) {
		return k / 10;
	}

A and B are used as if they have both values true and false. 

## Run VarexJ

a) as test: see test package "cmu.*", it contains several examples for variability-aware execution

b) as JVM via command line:

`java -jar ..\RunJPF.jar +native_classpath=.."path to VarexJ"\lib\* +search.class=.search.RandomSearch +featuremodel="path to the feature model"\model.dimacs +choice=TreeChoice +factory=BDD +classpath="path to the application"\bin\ A.B.Main args `

# Scalability

## Interaction Benchmarks

We did several experiments on small bechmark programms to analyze the scalability of variability-aware execution compared to other approaches. All benchmarks are adjusteble to the number of options from 0 to 100. The performance measures are shown in the three right diagrams. The most diagramms in the second column show how the options interact on data and on the program flow, and the resulting essential configuration complexity (i.e., essential effort to execute instructions cuased by interactions). 

<a href="/resources/VarexJ/benchmarks.PNG"><img alt="Benchmarks" src="/resources/VarexJ/benchmarks.PNG" width="800"/></a>

We compared the scalability of VarexJ with the following tools:

[JavaPathfinder (JPF)](http://babelfish.arc.nasa.gov/trac/jpf), [JPF-symbolic](http://babelfish.arc.nasa.gov/trac/jpf/wiki/projects/jpf-symbc), [JPF-bdd](https://bitbucket.org/rhein/jpf-bdd/wiki/Home),
[SPLat](http://www.cin.ufpe.br/~pbsf/publications/kim-etal-fse2013.pdf)([source code](https://github.com/meinicke/VarexJ/tree/master/Evaluations/SPLat))

## Study on overhead and efficiency of VarexJ

<a href="/resources/VarexJ/table.PNG"><img alt="Teable" src="/resources/VarexJ/table.PNG" width="800"/></a>
µJVM, average execution time with the JVM - µVarexJ - average execution time
for VarexJ without conditional options, overhead to JVM in parentheses - maxVarexJ - maximal execution time for VarexJ
without conditional options - VA VarexJ, time for variability-aware execution, overhead to µVarexJ and maxVarexJ in
parentheses.

# Understanding Interactions

Distributions of essential configuration complexity (blue bars), interaction degree on data (green bars), and interaction degree on the control flow (red line):

### Elevator
<a href="/resources/VarexJ/Traces/Elevator.png"><img alt="Elevator" src="/resources/VarexJ/Traces/Elevator.png" width="800"/></a>

### Mine Pump
<a href="/resources/VarexJ/Traces/Mine.png"><img alt="Elevator" src="/resources/VarexJ/Traces/Mine.png" width="800"/></a>

### E-Mail
<a href="/resources/VarexJ/Traces/Email.png"><img alt="E-Mail" src="/resources/VarexJ/Traces/Email.png" width="800"/></a>

### GPL
<a href="/resources/VarexJ/Traces/GPL.png"><img alt="GPL" src="/resources/VarexJ/Traces/GPL.png" width="800"/></a>

### ZipMe
<a href="/resources/VarexJ/Traces/ZipMe.png"><img alt="ZipMe" src="/resources/VarexJ/Traces/ZipMe.png" width="800"/></a>

### QuEval
<a href="/resources/VarexJ/Traces/QuEval.png"><img alt="QuEval" src="/resources/VarexJ/Traces/QuEval.png" width="800"/></a>

### Prevayler
<a href="/resources/VarexJ/Traces/Prevayler.png"><img alt="Prevayler" src="/resources/VarexJ/Traces/Prevayler.png" width="800"/></a>

### Checkstyle
<a href="/resources/VarexJ/Traces/Checkstyle.png"><img alt="Checkstyle" src="/resources/VarexJ/Traces/Checkstyle.png" width="800"/></a>

### Jetty
<a href="/resources/VarexJ/Traces/Jetty.png"><img alt="Jetty" src="/resources/VarexJ/Traces/Jetty.png" width="800"/></a>

## Credits

* [Jens Meinicke](http://wwwiti.cs.uni-magdeburg.de/~meinicke/) (University of Magdeburg, Germany, Carnegie Mellon University, USA)
* [Christian Kästner](http://www.cs.cmu.edu/~ckaestne/) (Carnegie Mellon University, USA)
* [Chu-Pan Wong](https://www.cs.cmu.edu/~chupanw/) (Carnegie Mellon University, USA)
* [Thomas Thüm](https://www.tu-braunschweig.de/isf/team/thuem) (TU Braunschweig, Germany)
* [Gunter Saake](http://wwwiti.cs.uni-magdeburg.de/~saake/) (University of Magdeburg, Germany)

## Publications

Feature Interaction Study:

> Jens Meinicke, Chu-Pan Wong, Christian Kästner, Thomas Thüm, and Gunter Saake. [On Essential Configuration Complexity: Measuring Interactions In Highly-Configurable Systems](http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/MeinickeWK+:ASE16.pdf). In Proceedings of the International Conference on Automated Software Engineering (ASE), volume 31. ACM, September 2016. accepted.

Tool Description:

> Jens Meinicke. [VarexJ: A Variability-Aware Interpreter for Java Application](http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/M14.pdf). Master's thesis, University of Magdeburg, Germany, December 2014.

Thesis:
> Jens Meinicke. [Variational Debugging: Understanding Differences among Executions](http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/thesisMeinicke19.pdf). PhD thesis, University of Magdeburg, January 2019.

gh-pages/README.md
