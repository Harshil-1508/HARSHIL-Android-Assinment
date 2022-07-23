package Class



class product{

    var id:Int = 0
    var name:String = ""
    var reating:Float = 0f
    var catagary:String = ""
    var like_count:Int = 0
    var MRP:Double = 0.0

    fun offer() {
        var MRP = 1599
        var discount = 65
        var sele_price = 0


        println("sele_price : $sele_price")
    }
}

fun main() {
    var p1:product = product()
     p1.id = 1000001
     p1.name = "STREET 9"
     p1.reating = 4.5f
     p1.catagary = "Floral Georgette Fitted Top"
     p1.like_count = 2400
     p1.MRP = 1599.0

    p1.offer()
}