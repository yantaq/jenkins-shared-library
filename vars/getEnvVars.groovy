#!/usr/bin/env groovy

def call() {
    for(e in env){
        println e + " is " + ${e}
    }
}
