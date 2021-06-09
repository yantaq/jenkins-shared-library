#!/usr/bin/env groovy

def call() {
    try {
        return env.JOB_NAME.split("/")[-2].trim()
    } catch(Exception ex) {
        error "Repo name not found:  " + ex
    }
}
