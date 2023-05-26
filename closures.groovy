/**
 * Syntax
 * { [closureParameters -> ] statements }
 * The -> character is required and serves to separate the arguments from the closure
 * body. The statements portion consists of 0, 1, or many Groovy statements.
 */

// 	A closure referencing a variable named item
// def item = 0
// increment = { item++ } 
// increment.call()
// increment()
// println item                                        

// 	It is possible to explicitly separate closure parameters from code by adding an arrow (->)
// { -> item++ }                                       

// 	A closure using an implicit parameter (it)
// printMessage = { println it }                                      
// printMessage("Hey");

// 	An alternative version where it is an explicit parameter
// { it -> println it }                                

// 	In that case it is often better to use an explicit name for the parameter
// { name -> println name }                            

// 	A closure accepting two typed parameters
// printMessage = { String x, int y ->                                
//     println "hey ${x} the value is ${y}"
//     println "Square of ${y} = ${y*y}"
// }
// printMessage("Shivang", 12)
// println printMessage.class

// 	A closure can contain multiple statements
// { reader ->                                         
//     def line = reader.readLine()
//     line.trim()
// }

/**
 * Closures as an object
 * A closure is an instance of the groovy.lang.Closure class, making it assignable to a
 * variable or a field as any other variable, despite being a block of code
 */

// You can assign a closure to a variable, and it is an instance of groovy.lang.Closure
// def listener = { e -> println "Clicked on $e.source" }      
// println listener instanceof Closure
// // If not using def or var, use groovy.lang.Closure as the type
// Closure callback = { println 'Done!' }  
                    
// Closure<Boolean> isTextFile = {
//     // Optionally, you can specify the return type of the closure by using the generic type of 
//     // groovy.lang.Closure
//     File it -> it.name.endsWith('.txt')           
// }

// Closure<Integer> squareOf = {
//     it -> it*it
// }
// println(squareOf(2));

/**
 * Calling a closure
 */
// def code = { 123 }
// println code()
// println code.call()

// def isOdd = { int i -> i%2 != 0 }
// println isOdd(3)
// println isOdd.call(3)


/**
 * Implicit parameter in closure
 * When a closure does not explicitly define a parameter list (using ->), a closure always defines
 * an implicit parameter, named it.
 */

// def greeting = { "Hello, $it!" }
// println greeting('Patrick')

/**
 * Varargs in closures
 */
// def concat1 = {String... args -> args.join('-') }
// def concat2 = { ...args -> args.join('-') }         
// println concat1('abc','def')
// println concat2('abc','def')