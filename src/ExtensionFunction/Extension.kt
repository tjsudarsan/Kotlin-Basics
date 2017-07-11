package ExtensionFunction

/**
 * Created by Sudarsan on 24-05-2017.
 */

//Extension function is used to not to change the source code file, instead we can define a function and we can use it.


fun main(args : Array<String>){

    var a = Print()
    a.name = "Sudarsan"
    a.show()

    var b = Print()
    b.name = "T J"
    b.show()

    var c = Print()
    c.name = a.plus(b)    //So, this is the extension function call
    c.show()
}

//Extension function definition
fun Print.plus(x : Print) : String{
    var y = Print()
    y.name = this.name + " " + x.name
    return y.name
}