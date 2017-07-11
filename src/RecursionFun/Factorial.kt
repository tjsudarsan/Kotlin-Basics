package RecursionFun

import java.util.*

/**
 * Created by Sudarsan on 24-05-2017.
 */

fun main(args : Array<String>)
{
    var s = Scanner(System.`in`)

    println(fact(s.nextInt()))

}

fun fact(a : Int) : Int{
    if(a == 0)
        return 1
    else
        return a * fact(a-1)
}