package looping

fun main() {

    var num = 1

    while (num<10){
        num++
        println(num)

    }

    do {
        num++
        println(num)
    }while (num<11)

    println("final value of : $num")



}