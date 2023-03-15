import org.codehaus.groovy.runtime.StackTraceUtils

class Calculator {
    double add(double a, double b) {
        println(getCurrentMethodName())
        return a + b
    }

    double minus(double a, double b) {
        return a - b
    }

    double multiply(double a, double b) {
        a * b
    }

    def divide(int a, int b) {
        try {
            a / b
        } catch (ArithmeticException e) {
            println "b was zero: $b"
            null
        }
    }

    def getCurrentMethodName() {
        def marker = new Throwable()
        StackTraceUtils.sanitize(marker).stackTrace[2].methodName
    }
}