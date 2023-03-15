import org.codehaus.groovy.runtime.StackTraceUtils

Calculator calculator = new Calculator()

result = calculator.add(2, 3)
println "Addition Result is: ${result}"
assert result == 5
assert result instanceof Number

result = calculator.minus(3, 1)
println "Minus: ${result}"
assert result == 2
assert result instanceof Number

result = calculator.multiply(3, 2)
println "Multiply: ${result}"
assert result == 6
assert result instanceof Number

result = calculator.divide(6, 2)
println "Divide: ${result}"
assert result == 3.0
assert result instanceof Number

result = calculator.divide(3, 0)
println "Result is: ${result}"
assert result == null



