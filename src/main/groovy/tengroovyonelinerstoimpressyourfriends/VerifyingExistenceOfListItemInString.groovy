package tengroovyonelinerstoimpressyourfriends

// This is an opportunity to show off Groovy's Collection.inject(Object, Closure).

def wordList = ["Groovy", "dynamic", "Grails", "Gradle", "scripting"]
def string = "This is an example blog talking about Groovy and Gradle."
wordList.inject(false){ acc, value -> acc || string.contains(value)}
