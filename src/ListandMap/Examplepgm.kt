package ListandMap

import java.util.*
import kotlin.collections.HashMap

/**
 * Created by Sudarsan on 23-05-2017.
 */

fun main(args : Array<String>){
    //delclare variable
    var a = listOf("sudarsan","Menaka","Dillima","sri","kishore","babu")
    var map = HashMap<String,Int>()
    var scn = Scanner(System.`in`)

    for(b in a){
        print("Enter the age of $b: ")
        var temp = scn.nextInt()
        map.put("$b",temp)
    }

    //Display the values
    for((name,age) in map){
        println("$name : $age")
    }
}

