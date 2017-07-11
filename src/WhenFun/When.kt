package WhenFun

/**
 * Created by Sudarsan on 22-05-2017.
 */

fun main(args : Array<String>){
    var a : Int
    a= 2

    //When statement is like a Switch() Statement

    var result = when(a)
    {
        1 -> "one"
        2 -> "two"
        3 -> "Three"
        else -> "more than 3"
    }

    println(result)
}