package InfixAndOperatorOverloading

import java.util.*

/**
 * Created by Sudarsan on 24-05-2017.
 */

fun main(args : Array<String>){

    var s = Scanner(System.`in`)

    var a = Display()
    print("Enter the First Name: ")
    a.name = s.nextLine()
    a.print()

    var b = Display()
    print("Enter the Last Name: ")
    b.name = s.nextLine()
    b.print()

    var c = Display()
    c = a plus b    // To use like this instead of a.plus(b) we need to add keyword "infix" at the function definition
    c.print()
}

infix fun Display.plus(x : Display) : Display{   //So infix is used here
    var y = Display()
    y.name = this.name + " " + x.name
    return y
}