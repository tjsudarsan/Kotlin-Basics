package Strings

import java.util.*

/**
 * Created by Sudarsan on 22-05-2017.
 */

fun main(args : Array<String>){

    var name1 : String = "Sudarsan"
    var name2 = "Babu"
    var name3 : String? = null

    var s = Scanner(System.`in`)
    name3 = s.nextLine()

    var result = if(name1 == name3) "Equal" else "Not Equal"

    println(result)

    if(name1.equals(name2))
        println("equal")
    else
        println("Not Equal")


}

