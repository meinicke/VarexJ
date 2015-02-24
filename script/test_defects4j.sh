ant clean
ant -buildfile jpf-nhandler/build.xml clean
ant build
ant -buildfile jpf-nhandler/build.xml build
ant test_defects4j