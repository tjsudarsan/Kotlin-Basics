package BigInt

import java.math.BigInteger
import java.util.*

/**
 * Created by Sudarsan on 24-05-2017.
 */

//BigInteger is used to hold large amount of Numbers
fun main(args : Array<String>)
{
    var s = Scanner(System.`in`)

    println(fact(s.nextBigInteger()))

}

fun fact(a : BigInteger) : BigInteger{
    if(a == BigInteger("0"))
        return BigInteger("1")
    else
        return a * fact(a- BigInteger("1"))
}