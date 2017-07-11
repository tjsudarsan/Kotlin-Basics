package Strings

/**
 * Created by Sudarsan on 24-05-2017.
 */

fun main(args : Array<String>){

    var a : String = "sudarsan"
    var b : String = "TJ"
    var c : String = ""

    c = a.capitalize() //Converts first character of a string into Capital Letter
    println(c)

    c = a[4].toString() //returns the character at index position
    println(c)

    c = a.plus(b)
    println(c)  //concatinates the two string

    c = a.drop(2)  //deletes the n characters from the first
    println(c)

    c = a.dropLast(2)  //deletes the n characters from the last
    println(c)

    c = a.removeRange(2..4)  //removes charcters in the range
    println(c)

    c = a.reversed()  //reverse the given string
    println(c)

    var d : CharArray
    d = a.toCharArray()   //converts string into sequence of char elements in array
    println(d[4])
}