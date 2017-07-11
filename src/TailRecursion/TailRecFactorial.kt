package TailRecursion

import java.math.BigInteger
import java.util.*

/**
 * Created by Sudarsan on 24-05-2017.
 */

fun main(args : Array<String>)
{
    var s = Scanner(System.`in`)

    println(fact(s.nextBigInteger(), BigInteger.ONE))

}

//tailrec is used to support the compiler to process the large output like 70000 and above

tailrec fun fact(a : BigInteger, result : BigInteger) : BigInteger{
    if(a == BigInteger.ZERO) {
        var str = result.toString()
        var length : Int = str.length
        println(length)  //to print the number of digits in the result
        return result
    }
    else
        return fact(a- BigInteger.ONE, a*result)
}