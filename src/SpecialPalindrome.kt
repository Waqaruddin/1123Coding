import java.lang.StringBuilder

fun main() {

    println(specialPalindrome("aaaa"))
}

fun specialPalindrome(s: String): Int {

    var count = 0
    var str = s.toLowerCase()
    var list = ArrayList<String>()

    for (i in 0 until str.length) {
        for (j in i + 1 until str.length) {
            list.add(str.substring(i, j))
        }
    }

    for (i in list) {
        println(i)
        if (i.reversed() == i) {
            count += 1
        }
    }
    return count

}