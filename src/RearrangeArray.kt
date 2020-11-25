//Write a program to sort an array of positive integers of a given array,
// in the sorted array the value of the first element should be maximum,
// second value should be minimum value, third should be second maximum,
// fourth second be second minimum and so on.

fun main() {

}



fun rearrange(array: IntArray, n: Int): IntArray? {
    array.sort()
    val temp = IntArray( n )
    var smallNum = 0
    var largeNum = n - 1
    var flag = true
    for (i in 0 until n) {
        if (flag)
            temp[i] = array[largeNum--]
        else
            temp[i] = array[smallNum++]
        flag = !flag
    }
    return temp
}

