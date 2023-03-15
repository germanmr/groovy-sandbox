Person p1 = new Person("John", 41)
Person p2 = new Person("Mary", 68)
Person p3 = new Person("Damian", 17)

def allPersons = [p1, p2, p3]

assert allPersons instanceof ArrayList

assert allPersons.size() == 3

allPersons.each { println "$it" }

assert allPersons.eachWithIndex { Person person, int index -> "Person: $person Index: $index" }
assert allPersons.find { it.name == "John" } == p1

assert allPersons.collect { it.age > 40 } == [true, true, false]
assert allPersons.sort { it.age } == [p3, p1, p2]