package InfixAndOperatorOverloading

import java.util.*

/**
 * Created by Sudarsan on 24-05-2017.
 */

fun main (args : Array<String>){

    //Create Scanner object
    var s = Scanner(System.`in`)

    //Create object for Store class
    var a = Store()
    a.data = s.nextLine()

    var b = Store()
    b.data = s.nextLine()

    var c = Store()
    c = a + b  //Operator overloading can be used in Kotlin. Here a + b is converted into a.plus(b)
    c.display()
}

operator fun Store.plus(temp : Store) : Store {  //Fot Operator overloadin to work we need to use operator keyword
    var x = Store()
    x.data = this.data + " " + temp.data
    return x
}