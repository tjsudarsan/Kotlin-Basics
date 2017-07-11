package ListandMap

/**
 * Created by Sudarsan on 23-05-2017.
 */

fun main(args : Array<String>){

    //declare normal list i.e. arrays
    var nums = listOf('a','b','c')

    //display the list elements
    for(a in nums)
        print(a)
    println()

    //display with indez
    for((a,b) in nums.withIndex())
        println("$a : $b")
}