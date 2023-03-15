package tengroovyonelinerstoimpressyourfriends

//Scala and Groovy implementations of this one liner are also covered in James
// Strachan's post "a groovy scala example" and the Groovy version is inspired
// by Guillaume Laforge's referenced Tweet (proof that one can put something of substance within 140 characters).

def (passed, failed) = [49, 58, 76, 82, 88, 90].split{it > 60}

