println "Creating a def variable"
def x = 104
println x.getClass()
println "Changing value to String"
x = "Guru99"
println x.getClass()

println "Creating an Integer"
int staticTypeX = 104
println staticTypeX.getClass()
println "Assigning a String to staticTypeX --> should not work!!"
staticTypeX = "String"
