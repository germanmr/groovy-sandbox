def list = ["Angular", "Nodejs",];

println list

def objectsArray = ["Groovy", 2, 42.6]

println objectsArray
println objectsArray.collect { it.getClass() }

// add() //	Allows you to append the new value to the end of this List.
objectsArray.add "hello"
println objectsArray
// contains() Returns true if this List contains a certain value.
println "Contains Groovy"
objectsArray.contains "Groovy"
// get() Returns the element at the definite position
println objectsArray.get(0)
//isEmpty()	Returns true value if List contains no elements
println "Not Empty: ${objectsArray.isEmpty()}"
//minus()	This command allows you to create a new List composed of the elements of the original excluding those which are specified in the collection.
println "Removing Groovy and 2 element ${(objectsArray - ["Groovy", 2])}"
//plus()	Allows you to create a new List composed of the elements of the original together along with mentioned in the collection.
println "Adding them again --> Groovy and 2 element ${(objectsArray + ["Groovy", 2])}"
