#!/bin/bash

#compile
javac18 -sourcepath ./src -d bin src/Main.java

#run
java18 -classpath bin Main

