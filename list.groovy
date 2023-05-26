// /**
//  * Example1
//  */
// def numbers = [1, 2, 3]         

// println numbers instanceof list 
// println numbers.size()      

// def heterogeneous = [1, "a", true]
// println heterogeneous

// /**
//  * Example2
//  */

// def arrayList = [1, 2, 3]
// println arrayList instanceof java.util.ArrayList

// def linkedList = [2, 3, 4] as LinkedList    
// println linkedList instanceof java.util.LinkedList

// LinkedList otherLinked = [3, 4, 5]          
// println otherLinked instanceof java.util.LinkedList

// /**
//  * Can access elements of the list with the [] subscript operator (both for reading and setting values) 
//  * with positive indices 
//  * with negative indices 
//  * with ranges
//  * use the << leftShift operator to append elements to a list
//  */

// def letters = ['a', 'b', 'c', 'd']
// // 	Access the first element of the list (zero-based counting)
// println letters[0]     
// println letters[1]

// // Access the last element of the list with a negative index: -1 is the first element from the end of the list
// println letters[-1]    
// println letters[-2]

// // Use an assignment to set a new value for the third element of the list
// letters[2] = 'C'             
// println letters[2]

// // Use the << leftShift operator to append an element at the end of the list
// letters << 'e' 
// println letters[ 4]
// println letters[-1]

// // Access two elements at once, returning a new list containing those two elements
// println letters[1, 3]      

// // Use a range to access a range of values from the list, from a start to an end element position
// println letters[1..3]

// // Multidimensional list
// def multi = [[0, 1], [2, 3]]
// println multi[1][0] == 2

