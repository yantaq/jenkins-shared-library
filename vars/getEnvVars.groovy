#!/usr/bin/env groovy

def call() {
    for(e in env){
        echo e + " is " + ${e}
    }
}
