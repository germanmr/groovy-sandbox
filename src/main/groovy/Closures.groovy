def myClosure = {
    println "My First Closure"
}
myClosure()

def myClosureWithParameters = {
    param1, param2 ->
        println "$param1"
        println "$param2"
}
myClosureWithParameters("First parameter", "Second Parameter")

def myClosureWithParametersAndReturnsAValue = {
    param1 ->
        println "Sent parameter: $param1"
        return "$param1"
}
def returned = myClosureWithParametersAndReturnsAValue("First parameter")
println "returned value $returned"
println "returned value type ${returned.getClass()}"