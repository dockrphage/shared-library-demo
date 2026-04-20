package org.cwvj

class Utils {

    def steps   // injected pipeline steps

    Utils(steps) {
        this.steps = steps
    }

    def shout(String message) {
        steps.echo "UTILS: ${message.toUpperCase()}"
    }

    def repeat(String message, int times) {
        (1..times).each {
            steps.echo "REPEAT ${it}: ${message}"
        }
    }
}
