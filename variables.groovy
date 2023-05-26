println "===================================================="
// String name = "Variable"
// println(name)
// name = 2
// println(name)

// def n = 9
// println n
// n="nine"
// println n

// ten = 10
// println ten
// ten = "ten"
// println ten

/**
 *  Multiple assignment
 */

 // example 1
// def (a, b, c) = [10, 20, 'foo']
// println a == 10 && b == 20 && c == 'foo'


// example 2
// def (int i, String j) = [10, 'foo']
// println i == 10 && j == 'foo'


// example 3
// The syntax works for arrays as well as lists, as well as methods that return either of these:
// def nums = [1, 3, 5]
// def a, b, c
// (a, b, c) = nums
// println a == 1 && b == 3 && c == 5



// example 4
// def (_, month, year) = "18th June 2009".split()
// println "In $_ $month of $year"// == 'In June of 2009'



// If the left hand side has too many variables, excess ones are filled with null’s
// def (a, b, c) = [1, 2]
// println a
// println b
// println c
// // println a == 1 && b == 2 && c == null



// If the right hand side has too many variables, the extra ones are ignored
// def (a, b) = [1, 2, 3]
// println a
// println b
// println a == 1 && b == 2



/**
 * Object destructuring with multiple assignment
 * We can override the getAt()/putAt() method.
 */
// class Coordinates {
//     double latitude
//     double longitude

//     double getAt(int idx) {
//         if (idx == 0) latitude
//         else if (idx == 1) longitude
//         else throw new Exception("Wrong coordinate index, use 0 or 1")
//     }
//     double putAt(int idx, int value) {
//         if (idx == 0) latitude = value
//         else if (idx == 1) longitude = value
//         else throw new Exception("Wrong coordinate index, use 0 or 1")
//     }
// }
// def coordinates = new Coordinates(latitude: 43.23, longitude: 3.67) 

// def (la, lo) = coordinates                                          

// println la                                              
// println lo
// println(coordinates[0])
// coordinates[0] = 10
// println(coordinates[0])
// (la, lo) = coordinates  
// println la
// println lo

