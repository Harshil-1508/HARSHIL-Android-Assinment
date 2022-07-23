package Null_Sefty_operator

fun main() {

    var name:String? = null

    println("length : ${name?.length}")

    //elvish operator(?:)

    var temp = name?: "harshil"
    println(temp)



}