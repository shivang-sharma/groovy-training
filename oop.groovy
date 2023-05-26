// class Main {
//     // instance varibales, method -> create object
//     // class variable, methods -> We can access using Class Name
//     def static sayHi() {
//         println "Hi"
//     }
//     public static void main(String... args) {          
//         println 'Groovy world!'     
//         Main main = new Main();
//         sayHi();
//     }
// }

// If it were a script
// println 'Groovy world!'

// A script is always compiled into a class. The Groovy compiler will compile the class for you,
// with the body of the script copied into a run method. The previous example is therefore 
// compiled as if it was the following:
// import org.codehaus.groovy.runtime.InvokerHelper
// class oop extends Script {                     
//     def run() {                                 
//         println 'Groovy world!'                 
//     }
//     static void main(String[] args) {           
//         InvokerHelper.runScript(oop, args)     
//     }
// }

// Exampe 2

// println 'Hello'                                 

// int power(int n) { 2**n }                       

// println "2^6==${power(6)}"

// // internally converted into:
// import org.codehaus.groovy.runtime.InvokerHelper
// class oop extends Script {
//     int power(int n) { 2** n}                   
//     def run() {
//         println 'Hello'                         
//         println "2^6==${power(6)}"              
//     }
//     static void main(String[] args) {
//         InvokerHelper.runScript(oop, args)
//     }
// }