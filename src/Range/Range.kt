package Range

/**
 * Created by Sudarsan on 22-05-2017.
 */

fun main(args : Array<String>){

    //print a values from 1 to 15
    var numbers = 1..15
    for (a in numbers)
        print(a)
    println("\nTotal numbers ${numbers.count()}")

    //print values from 1 to n-1
    numbers = 1 until 15
    for (a in numbers)
        print(a)
    println()

    //print from reverse 15 ... 1
    var num = 15 downTo 1
    for(a in num)
        print(a)
    println()

    //Here we can also use like this also
    for(a in num.reversed())
        print(a)
    println()

    //print with defined increment eg: a = a + 2
    var nums = 'A'..'Z'
    for (a in nums step 2)
        print(a)
    println()

    println(nums.first)
    println(numbers.endInclusive)
    println(nums.last)
}

