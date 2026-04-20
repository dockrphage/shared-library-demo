package org.cwvj

class Utils {

    def steps
    Logger logger

    Utils(steps) {
        this.steps = steps
        this.logger = new Logger(steps, "UTILS")
    }

    def shout(String message) {
        logger.info("Shouting message")
        steps.echo "UTILS: ${message.toUpperCase()}"
    }

    def repeat(String message, int times) {
        logger.info("Repeating message ${times} times")
        (1..times).each {
            steps.echo "REPEAT ${it}: ${message}"
        }
    }
}
