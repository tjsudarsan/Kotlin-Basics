package Functions


/**
 * Created by Sudarsan on 23-05-2017.
 */

fun main(args : Array<String>){

    var result = max(10,15)
    println(result)

}

fun max(a : Int, b : Int) : Int = if(a>b) a else b