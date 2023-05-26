// println "======================================"
// /**
//  * if / else
//  */
// // def x = false
// // def y = false

// // if ( !x ) {
// //     x = true
// // }

// // println x

// // if ( x ) {
// //     x = false
// // } else {
// //     y = true
// // }

// // println x 
// // println y



// /**
//  * switch / case
//  * Groovy switch statement can handle any kind of switch value and different kinds of matching 
//  * can be performed.
//  * 
//  */
// // def x = -4.0
// // def result = ""

// // switch (x) {
// //     case "foo":
// //         result = "found foo"
// //         // lets fall through

// //     case "bar":
// //         result += "bar"

// //     case [4, 5, 6, 'inList']:
// //         result = "list"
// //         break

// //     case 12..30:
// //         result = "range"
// //         break

// //     case Integer:
// //         result = "integer"
// //         break

// //     // case Number:
// //     //     result = "number"
// //     //     break

// //     case ~/fo*/: // toString() representation of x matches the pattern?
// //         result = "foo regex"
// //         break

// //     case { it < 0 }: // or { x < 0 }
// //         result = "negative"
// //         break

// //     default:
// //         result = "default"
// // }

// // println result



// /**
//  * Classic for loop
//  */
// //  String message = ''
// // for (int i = 0; i < 5; i++) {
// //     message += 'Hi '
// // }
// // println message


// /**
//  * Enhanced classic Java-style for loop
//  */

// // def facts = []
// // def count = 5
// // for (int fact = 1, i = 1; i <= count; i++, fact *= i) {
// //     facts << fact // append to facts
// // }
// // println facts



// /**
//  * Multi-assignment in combination with for loop
//  */
// // multi-assignment with types
// // def (String x, int y) = ['foo', 42]
// // println "$x $y" == 'foo 42'

// // multi-assignment goes loopy
// // def baNums = []
// // for (def (String u, int v) = ['bar', 42]; v < 45; u++, v++) {
// //     baNums << "$u $v"
// // }
// // println baNums



// /**
//  * for in loop
//  * Groovy also supports the Java colon variation with colons: for (char c : text) {}
//  */

// // iterate over a range
// // def x = 0
// // for ( i in 0..9 ) {
// //     x += i
// // }
// // println x

// // // iterate over a list
// // x = 0
// // for ( i in [0, 1, 2, 3, 4] ) {
// //     x += i
// // }
// // println x

// // // iterate over an array
// // def array = (0..4).toArray()
// // x = 0
// // for ( i in array ) {
// //     x += i
// // }
// // println x

// // iterate over a map
// // def map = ['abc':1, 'def':2, 'xyz':3]
// // x = 0
// // for ( e in map ) {
// //     println e
// //     println e.value
// //     println e.key
// // }
// // println x == 6

// // // iterate over values in a map
// // x = 0
// // for ( v in map.keySet() ) {
// //     x += v
// // }
// // println x

// // // iterate over the characters in a string
// // def text = "abc"
// // def list = []
// // for (c in text) {
// //     list.add(c)
// // }
// // println list


// /**
//  * while
//  */
// // def x = 0
// // def y = 5

// // while ( y-- > 0 ) {
// //     x++
// // }

// // println x


// /**
//  * do/while loop
//  */

// // classic Java-style do..while loop
// // def count = 5
// // def fact = 1
// // do {
// //     fact *= count--
// // } while(count > 1)
// // println fact


// def printMessage = { it ->
//     println("Hey $it");
// }

// /**
//  * Using int.upto(max)
//  */
// // 0.upto(4, printMessage)

// /**
//  * Using int.times
//  */
// // 5.times(printMessage)

// /**
//  * int.step(to, increment).
//  */
// //  0.step(5, 2, printMessage)
// //  0.step 5, 2, printMessage

// def list = [3, 2, 5, 1, 0]
// /**
//  * each method to loop through list values
//  */
// //  list.each(printMessage)

// /**
//  * using ranges
//  */
// //  (2..8).each(printMessage)

// /**
//  * eachWithIndex
//  */
//  def indexValueMessage = { value, index ->
//     println "Hey! index $index and value $value"
//  }
// //  list.eachWithIndex indexValueMessage

// /**
//  * eachWithIndex with ranges
//  */
// //  (2..8).eachWithIndex(indexValueMessage)