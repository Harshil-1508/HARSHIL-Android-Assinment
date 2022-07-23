
class Shape{

    fun area(r:Int){

        var pi = 3.14
        println("Area of Circle : ${pi*r*r}")

    }

    fun area(l:Int,b:Int){

        println("Area of Rectangle : ${l*b}")
    }
}

fun main() {

    var s1:Shape = Shape()
    s1.area(5,7)
}