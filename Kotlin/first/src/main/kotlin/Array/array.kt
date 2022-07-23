package Array

fun main() {
    var num = intArrayOf(23,32,54,45,65)
    var temp = floatArrayOf(34.3f,342.5f)
    var languages = arrayOf("kotlin","java","c/c++","python")
    var sum=0
    for (i in num){
        sum+=i
        println(i)
    }
    println("$sum")

    for (index in languages.indices ){
        println("$index")
    }
    println("value at index 1 : ${languages[0]}")

    println("length : ${languages.size}")
}