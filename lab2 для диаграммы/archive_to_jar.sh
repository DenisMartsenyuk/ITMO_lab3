#!/bin/bash

#compile
javac18 -sourcepath ./src -d bin src/Main.java 

#archive to jar
jar -cvfe Main.jar Main -C bin .
