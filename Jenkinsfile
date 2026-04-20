@Library('my-shared-lib') _

pipeline {
    agent any

    stages {
        stage('Class-based shared library') {
            steps {
                simpleEcho()

                simpleEchoWithMessage("Calling class-based utilities")

                utils().shout("hello from a class")
                utils().repeat("class method call", 2)
            }
        }
    }
}
