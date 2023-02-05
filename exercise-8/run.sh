#!/bin/sh

# Variables
MAIN="ComputeMean"
ARGS="data.txt"

# Preprocessing
cp src/data.txt bin

# Commands
cd "bin"
java $MAIN $ARGS