#!/bin/sh
ant -buildfile build.xml clean
ant -buildfile jpf-nhandler/build.xml clean
ant -buildfile build.xml build
ant -buildfile jpf-nhandler/build.xml build
ant -buildfile build.xml test