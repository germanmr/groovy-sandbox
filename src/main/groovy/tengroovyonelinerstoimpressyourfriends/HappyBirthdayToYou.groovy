package tengroovyonelinerstoimpressyourfriends

// This one-liner prints the first verse (and only verse for most of us!)
// "Happy Birthday" song based on a provided parameter named 'name.'

def  name = "German"
(1..4).collect { "Happy Birthday " + ((it == 3) ? "dear ${name}" : 'to You') }
        .each { line -> println line }