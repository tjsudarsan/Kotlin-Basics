package DefautNamedParameter

/**
 * Created by Sudarsan on 23-05-2017.
 */

fun main(args : Array<String>){

    var result = add(a = 10,b=0.15) //this is the named parameter i.e. to identify which function we are using
    println(result)

}

@JvmOverloads
fun add (a : Int,b : Double = 0.05) : Int
{
    return (a + a*b).toInt()
}