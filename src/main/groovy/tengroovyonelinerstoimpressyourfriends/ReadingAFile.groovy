package tengroovyonelinerstoimpressyourfriends

// Groovy's GDK's File makes reading a file's contents as a String or as a List of Strings easier than falling off a log.
def fileText = new File(getClass().protectionDomain.codeSource.location.path).text
println "Printing file as test"
println fileText

// getClass().protectionDomain.codeSource.location.path -> returns the current file!!

def fileLines = new File(getClass().protectionDomain.codeSource.location.path).readLines()

for (String line : fileLines) {
    println "line 1"
    println line
}

