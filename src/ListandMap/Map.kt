package ListandMap

/**
 * Created by Sudarsan on 23-05-2017.
 */

fun main(args : Array<String>){

    var a = HashMap<String,Int>()
    a["sudarsan"] = 20
    a["menaka"] = 19

    for ((name,age) in a){
        println("$name's age $age")
    }
}