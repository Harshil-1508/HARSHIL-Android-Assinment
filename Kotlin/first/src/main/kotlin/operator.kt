fun main() {

    var num1 = 34
    var num2 = 56


    var result = num1/num2.toFloat()
    println("result : $result")

    var rem = num1%num2
    println("reminder is :${num1%num2.toFloat()}")

    //ASCII VALUE

    var ch = 'A'
    println("ASCII value of charector :${ch.toInt()}")

    //assinment operator(+=,-=,*=,/=,%=)
    var num = 20
    num+=10
    println(num)

    //Increment / Decrement Operators (++, --)
    //println(num++)      // postfix
    println(++num)
    println("value after increment : $num")

    // Comparison and Equality Operators (>, <, !=, ==, >=, <=)

    var n1 = 20

    println(n1>10)
    println(n1<10)
    println(n1==340)
    println(n1!=32)

    // Logical Operator (&&, ||, !)
    println(n1>10 && n1<50)
    println(n1>0 && n1%5==0)
    println(n1%2==0 || n1%7==0)
    println(!(n1>10))


}