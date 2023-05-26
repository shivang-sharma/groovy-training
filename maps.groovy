// // // 	We define a map of string color names, associated with their hexadecimal-coded html colors
// def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF'] 

// // // We use the subscript notation to check the content associated with the red key
// // println colors['red']   
// // // We can also use the property notation to assert the color green’s hexadecimal representation
// // println colors.green

// // // Similarly, we can use the subscript notation to add a new key/value pair
// // colors['pink'] = '#FF00FF'           
// // // 	Or the property notation, to add the yellow color
// // colors.yellow  = '#FFFF00'           

// // println colors.pink
// // println colors['yellow']

// // /**
// //  * When using names for the keys, we actually define string keys in the map.
// //  * Groovy creates maps that are actually instances of java.util.LinkedHashMap.
// //  */
// // println colors instanceof java.util.LinkedHashMap

// // // If key is not present in the map it returns null
// // println colors.unknown

// // def emptyMap = [:]
// // println emptyMap.anyKey


// // // using variable as a key

// def key = 'name'
// def person = [key: 'Guillaume']      

// // println person.containsKey('name')   
// // println person.containsKey('key')  

// // // right way
// person = [(key): 'Guillaume']        

// println person.containsKey('name')    
// println person.containsKey('key')
