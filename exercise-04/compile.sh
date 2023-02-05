#!/bin/sh

# Variables

# Preprocessing

# Commands
find "src" -name "*.java" > .src
javac -d "bin" @.src -cp "src"