package ExceptionHandling

/**
 * Created by Sudarsan on 23-05-2017.
 */

fun main(args : Array<String>){
    var string = "12de"

    var num : Int = 0
    try {
        num = string.toInt()  //the string which has 'de' cant be converted into a int so it throws exception
     }catch (e : Exception){
        println("Enter Crrt Value")
    }finally {
        num++
    }
    println(num)
}