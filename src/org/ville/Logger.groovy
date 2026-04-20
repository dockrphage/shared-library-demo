package org.ville

class Logger {

    def steps
    String prefix = "Ville"

    Logger(steps, String prefix = "Ville") {
        this.steps = steps
        this.prefix = prefix
    }

    def info(String msg) {
        steps.echo "[INFO] [${prefix}] ${msg}"
    }

    def warn(String msg) {
        steps.echo "[WARN] [${prefix}] ${msg}"
    }

    def error(String msg) {
        steps.echo "[ERROR] [${prefix}] ${msg}"
    }
}
