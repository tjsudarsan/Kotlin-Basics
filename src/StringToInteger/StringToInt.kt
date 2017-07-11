package StringToInteger

/**
 * Created by Sudarsan on 23-05-2017.
 */

fun main(args : Array<String>){

    var a : String = "1245688"

    var b : Int = Integer.parseInt(a)  //here the string to int is converted using JAVA Library

    var c : Int = a.toInt() //This conversion is simple using kotlin simplified library..

    println(b)
    println(c)

}
