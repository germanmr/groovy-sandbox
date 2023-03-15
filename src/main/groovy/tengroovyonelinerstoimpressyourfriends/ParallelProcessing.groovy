package tengroovyonelinerstoimpressyourfriends

// One of the great new features of Groovy 1.8 is the bundling of GPars 0.11 in the Groovy distribution.
// GPars is described as a project that "offers developers new intuitive and safe ways to handle
// Java or Groovy tasks concurrently, asynchronously, and distributed by utilizing the power
// of the Java platform and the flexibility of the Groovy language."

// It was as a I was about to write an example of Groovy parallel processing using GPars that I
// discovered the existence of Arturo Herrero's blog post.
// I use a slightly adapted version of his example here.
// It assumes the existence of an initialized dataList and the existence of a method called processItem.


// groovyx.gpars.GParsPool.withPool { def result = dataList.collectParallel { processItem(it) } }
