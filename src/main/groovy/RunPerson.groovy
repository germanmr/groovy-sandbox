Person person1 = new Person("John", 26)
person1.setName("John")
person1.setAge(26)
println person1

Person person2 = new Person("John", 26)
person2.setName("John")
person2.setAge(26)
println person2

if (person1 == person2) println "Equals"

Closure printPerson = {
    Person person ->
        println "$person"
}

result = printPerson(person1)

handlePerson(person1, printPerson) // {Person println it}

static void handlePerson(Person p, Closure c) {
    if (p == null) {
        throw new RuntimeException()
    }
    c(p)
}


