import groovy.io.FileType

List<Number> list = []

def dir = new File("../resources")

//dir.eachFileRecurse(FileType.FILES) { file -> file.eachLine { e -> if (e instanceof Number()) list.add(e) } }
dir.eachFileRecurse(FileType.FILES) { file ->
    println file.eachLine {
        if (it.isNumber()) {
            list << it.toInteger()
        }
    }
}

assert list.max() == 2044
println "Max number: ${list.max()}"
assert list.sum() == 8253
println "Sum: ${list.sum { it.toInteger() }}"


