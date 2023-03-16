File textFile = new File("../resources/mary-hill.txt")

textFile.withWriter { writer ->
    writer.writeLine("Mary")
    writer.writeLine("Hill")
    writer.writeLine("30")
}

textFile.append("1")
textFile << "2"

println textFile.getText('UTF-8')

Person thomasMark = new Person("Thomas Mark", 21)

File binFile = new File("../resources/thomas-mark.bin")
binFile.withObjectOutputStream{out ->
    out.writeObject(thomasMark)
}
println binFile.getText('UTF-8')


