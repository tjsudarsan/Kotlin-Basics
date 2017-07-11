/**
 * Created by Sudarsan on 22-05-2017.
 */

fun main(args : Array<String>)
{
    println("Hello World")

    //Assign values to a Class and retrieve data from the classes
    //Here we declared Simple.class

    var a = Simple()
    var b = Simple()
    var c = Simple()

    //Assigning data
    a.name = "Sudarsan";
    a.age = 20;
    a.address = "Kanchipuram"

    b.name = "Kishore"
    b.age = 20
    b.address = "Kanchipuram"

    c.name = "Babu"
    c.age = 20
    c.address = "kanchipuram"

    //Retrieving data from classes
    println("1. Name: ${a.name} Age: ${a.age} Address: ${a.address}")
    println("2 . Name: ${b.name} Age: ${b.age} Address: ${b.address}")
    println("3. Name: ${c.name} Age: ${c.age} Address: ${c.address}")
}