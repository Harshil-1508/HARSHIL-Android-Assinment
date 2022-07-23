package string

fun main() {

    // equals

    var name = "harshil"
    var name1 = "Harshil"

    println(name.equals(name1 , ignoreCase = true))

    // uppercase/lowercase

    var name2 = "harshil patoliya"

    println(name2.uppercase())
    println(name2.lowercase())

    // get

    println(name2.get(10))

    // length

    println(name2.length)

   // substring

    println(name2.substring(12))
    println(name2.substring(5 ,12))
    println(name2.substring(3..10))

    //replace

    println(name2.replace("patoliya","patel",ignoreCase = true))

    //trim

    println(name2.trim().length)

    // index of

    println(name2.indexOf('r'))

    //start with

    var languages = arrayOf("Java", "Kotlin", "Dart", "PHP", "Java Script", "python")

    for (value in languages){
        if (value.startsWith("p",ignoreCase = true)){
            println(value)
        }

    }

    println("*********************************************************************************************************************************************************")

    for (i in languages){
        if (i.contains("a",ignoreCase = true)){
            println(i)
        }
    }
}