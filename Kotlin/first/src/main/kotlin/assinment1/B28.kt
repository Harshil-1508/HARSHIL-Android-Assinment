package assinment1

fun main() {

    val words = arrayOf("kotlin", "C", "Python", "Java")

    for (i in 0..2) {
        for (j in i + 1..3) {
            if (words[i].compareTo(words[j]) > 0) {

                // swap words[i] with words[j[
                val temp = words[i]
                words[i] = words[j]
                words[j] = temp
            }
        }
    }

    println("In lexicographical order:")
    for (i in 0..3) {
        println(words[i])
    }
}