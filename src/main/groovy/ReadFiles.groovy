Person person = new Person()

File file = new File("john-doe.txt")

println file.getText('UTF-8')

file.eachLine { line, no ->
    if (no == 1) {
        person.setName(line)
    } else if (no == 2) {
        person.setAge(line.toInteger())
    } else {
        throw new RuntimeException("It should be two lines")
    }
}

println person
