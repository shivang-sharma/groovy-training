// // 	Define an array of strings using explicit variable type declaration
// String[] arrStr = ['Ananas', 'Banana', 'Kiwi']

// // Check that we created an array of strings
// println arrStr instanceof String[]    
// println (arrStr instanceof List)

// // 	Create an array of ints with the as operator
// def numArr = [1, 2, 3] as int[]      

// // Check that we created an array of primitive ints
// println numArr instanceof int[]       
// println numArr.size()



// // create multi-dimensional arrays
// // 	You can define the bounds of a new array
// def matrix3 = new Integer[3][2]         
// println matrix3.size()

// //  declare an array without specifying its bounds
// Integer[][] matrix2                     
// matrix2 = [[1, 2], [3, 4]]
// println matrix2 instanceof Integer[][]

// // Accessing elements
// String[] names = ['Cédric', 'Guillaume', 'Jochen', 'Paul']
// println names[0]    

// names[2] = 'Blackdrag'          
// println names[2]


// /**
//  * Java-style array initialization
//  * in groovy version 3 and above below code works fine
//  */

// def primes = new int[] {2, 3, 5, 7, 11}
// println primes.size() + ' ' + primes.sum()
// println primes.class

// def pets = new String[] {'cat', 'dog'}
// println pets.size() == 2 && pets.sum() == 'catdog'
// // // println pets.class.name == '[Ljava.lang.String;'

// // // traditional Groovy alternative still supported
// String[] groovyBooks = [ 'Groovy in Action', 'Making Java Groovy' ]
// println groovyBooks.every{ it.contains('Groovy') }

