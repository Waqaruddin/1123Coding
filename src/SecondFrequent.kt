

fun main(){
secondFrequent("aaaabbbfffffff")
}

fun secondFrequent(s:String){
    var hm = HashMap<String, Int>()

    for(i in s){
        hm[i.toString()] = hm.getOrDefault(i.toString(), 0 ) + 1
    }

     var hm2 = hm.entries.sortedWith(compareBy { it.value })

    println(hm2[hm2.size-2].value)
}