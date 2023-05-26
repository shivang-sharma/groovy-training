// Single quoted Strings
/**
 * Single-quoted strings are plain java.lang.String
 * Don’t support interpolation.
 */

// println ('a single-quoted string');

// String concatenation
// println 'a' + 'b'


/**
 * Triple-single-quoted string
 * Triple-single-quoted strings are plain java.lang.String
 * Don’t support interpolation.
 * Triple-single-quoted strings may span multiple lines
 */
// def aMultilineString = '''line one
// line two
// line three'''
// println aMultilineString;

/**
 * Double-quoted String
 * Double-quoted strings are plain java.lang.String if there’s no interpolated expression
 * groovy.lang.GString instances if interpolation is present.
 * 
 */
// println "a double-quoted string"


/**
 * String interpolation
 * ${}, $
 */
// def name = 'Guillaume' // a plain string
// def greeting = "Hello ${name}"
// // println greeting
// greeting = "Hello $name"
// println greeting.toString() == 'Hello Guillaume'
// def expression = "Expression ${2+2}"
// println expression
// def person = [name: 'Guillaume', age: 36]
// println "$person.name is $person.age years old"

/**
 * Triple-double-quoted string
 */
// def n = 'Groovy'
// def template = """
//     Dear Mr ${n},
//     You're the winner of the lottery!
//     Yours sincerly,
//     Dave
// """
// println template


/**
 * Slashy string
 * Useful for defining regular expressions and patterns, as there is no need to escape backslashes
 * Only forward slashes need to be escaped with a backslash
 * Slashy strings are multiline
 * support interpolation
 */
//  def fooPattern = /.*\foo.*/
//  println fooPattern

//  def escapeSlash = /The character \/ is a forward slash/
//  println escapeSlash


 /**
  * Dollar slashy string
  * $ is used as the escape character
  */ 
def fname = "Shivang"
def date = "April, 1st"
def dollarSlashy = $/
    Hello $fname,
    today we're ${date}.

    $ dollar sign
    $$ escaped dollar sign
    \ backslash
    / forward slash
    $/ escaped forward slash
    $$a$/ escaped opening dollar slashy
    $/$$ escaped closing dollar slashy
/$
println dollarSlashy





/**
 * Characters
 * Groovy doesn't have an explicit character literal
 * The first option 1 is interesting when the character is held in a variable.
 * Other two (2 and 3) are more interesting when a char value must be passed as argument of a method call.
 */

// 	by being explicit when declaring a variable holding the character
//  by specifying the char type
char c1 = 'A' 
println c1 instanceof Character

// by using type coercion with the as operator
def c2 = 'B' as char 
println c2 instanceof Character

// by using a cast to char operation
def c3 = (char)'C' 
println c3 instanceof Character