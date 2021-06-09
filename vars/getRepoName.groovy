#!/usr/bin/env groovy

def call() {
    try {
        println env.JOB_NAME
        return env.JOB_NAME.split("/")[-1].trim()
    } catch(Exception ex) {
        error "Repo name not found:  " + ex
    }
}
