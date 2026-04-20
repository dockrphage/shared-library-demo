@Library('my-shared-lib') _

pipeline {
    agent any

    stages {
        stage('Class-based shared library with logging') {
            steps {
                simpleEcho()
                simpleEchoWithMessage("Testing logging")

                script {
                    utils().shout("hello from a class")
                    utils().repeat("class method call", 2)
                }
            }
        }
    }
}
