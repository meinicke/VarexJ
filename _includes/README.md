VarexJ
======

Highly-configurable systems allow users to achieve their specific needs. Such software systems are flexible, but come with difficulties for program analyses, as it is usually not possible to test all combinations of options separately due to the configuration space explosion.  Variability-aware approaches exploit redundancies among configurations to share analysis efforts. Variability-aware execution aggressively shares computations and data in program execution across multiple configurations, for example, when executing a test over all configurations. By maximizing sharing, the approach can outperform traditional approaches by orders of magnitude on many highly-configurable systems, without falling back to incomplete sampling strategies.  We investigate and evaluate the impact of interactions on sharing and scalability to current testing approaches using several small benchmark programs. We show that sharing reduces the number of executed instructions significantly, while the effort to execute them usually stays low. We applied VarexJ to several larger real-world applications to  illustrate typical sharing potential in real-world applications. Finally, we found that options high interact on data in these systems, but only local, orthogonal and rare.

VarexJ is based on [JavaPathfinder](http://javapathfinder.sourceforge.net/) v7.0 (rev 1155+).

#Usage

##Build

Import the project into eclipse.

If it does not build automatically, right-click on the build.xml "\run as\Ant Build"
The build process has to be run with JDK 7, JRE will not work.

JDK 7 is required.

##VarexJ options

* set feature expression [SAT, BDD]:
	`factory=BDD`
* set choice type [TreeChoice, MapChoice]:
	`choice=TreeChoice`
* define constraints of the application with a dimacs file (can be created with [FeatureIDE](http://fosd.net/fide)):
	`featuremodel="path"\model.dimacs`
* define whether a method call on multiple opjects (i.e., Choice(Feature, Object1, Object2)) of the same type should be shared:
	`invocation=true`

##Specify conditional boolean fields
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

##Run VarexJ

a) as test: see test package "cmu.*", it contains several examples for variability-aware execution

b) as JVM via command line:

`java -jar ..\RunJPF.jar +native_classpath=.."path to VarexJ"\lib\* +search.class=.search.RandomSearch +featuremodel="path to the feature model"\model.dimacs +choice=TreeChoice +factory=BDD +classpath="path to the application"\bin\ A.B.Main args `

# Scalability

We did several experiments on small bechmark programms to analyze the scalability of variability-aware execution compared to other approaches. All benchmarks are adjusteble to the number of options from 1 to 100. The measured results are shown in the three middle diagrams. The most right diagramms show how the options interact on data and on the program flow. 

<a href="/resources/VarexJ/benchmarks.PNG"><img alt="Benchmarks" src="/resources/VarexJ/benchmarks.PNG" width="800"/></a>

We compared the scalability of VarexJ with the following tools:

[JavaPathfinder (JPF)](http://babelfish.arc.nasa.gov/trac/jpf), [JPF-symbolic](http://babelfish.arc.nasa.gov/trac/jpf/wiki/projects/jpf-symbc), [JPF-bdd](https://bitbucket.org/rhein/jpf-bdd/wiki/Home),
[SPLat](http://www.cin.ufpe.br/~pbsf/publications/kim-etal-fse2013.pdf)([source code](https://github.com/meinicke/VarexJ/tree/master/SPLat))


#Understanding Interactions

Distributions of interactions during program execution (blue bars represent interactions on data, the red line shows interactions on the program flow (#features in the context)):

### Elevator
<a href="/resources/VarexJ/Traces/Elevator.png"><img alt="Elevator" src="/resources/VarexJ/Traces/Elevator.png" width="800"/></a>

### Mine Pump
<a href="/resources/VarexJ/Traces/Mine.png"><img alt="Elevator" src="/resources/VarexJ/Traces/Mine.png" width="800"/></a>

### E-Mail
<a href="/resources/VarexJ/Traces/Email.png"><img alt="Elevator" src="/resources/VarexJ/Traces/Email.png" width="800"/></a>

### GPL
<a href="/resources/VarexJ/Traces/GPL.png"><img alt="Checkstyle" src="/resources/VarexJ/Traces/GPL.png" width="800"/></a>

### ZipMe
<a href="/resources/VarexJ/Traces/ZipMe.png"><img alt="Checkstyle" src="/resources/VarexJ/Traces/ZipMe.png" width="800"/></a>

### QuEval
<a href="/resources/VarexJ/Traces/QuEval.png"><img alt="Checkstyle" src="/resources/VarexJ/Traces/QuEval.png" width="800"/></a>

### Prevayler
<a href="/resources/VarexJ/Traces/Prevayler.png"><img alt="Checkstyle" src="/resources/VarexJ/Traces/Prevayler.png" width="800"/></a>

### Checkstyle
<a href="/resources/VarexJ/Traces/Checkstyle.png"><img alt="Checkstyle" src="/resources/VarexJ/Traces/Checkstyle.png" width="800"/></a>

##Credits

* [Jens Meinicke](http://wwwiti.cs.uni-magdeburg.de/~meinicke/) (University of Magdeburg, Germany, project lead)
* [Christian Kästner](http://www.cs.cmu.edu/~ckaestne/) (Carnegie Mellon University, USA)
* [Chu-Pan Wong](https://www.cs.cmu.edu/~chupanw/) (Carnegie Mellon University, USA)
* [Thomas Thüm](https://www.tu-braunschweig.de/isf/team/thuem) (TU Braunschweig, Germany)
* [Gunter Saake](http://wwwiti.cs.uni-magdeburg.de/~saake/) (University of Magdeburg, Germany)

##Publications

Initial Work:

> Jens Meinicke. [VarexJ: A Variability-Aware Interpreter for Java Application](http://wwwiti.cs.uni-magdeburg.de/iti_db/publikationen/ps/auto/M14.pdf). Master's thesis, University of Magdeburg, Germany, December 2014.
