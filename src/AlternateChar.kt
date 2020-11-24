fun main(){

    println(alternatingCharacters("AABAAB"))
}

fun alternatingCharacters(s:String):Int{


    var del = 0
    for(i in 0 until s.length-1){
        if(s[i] == s[i+1]){
            del +=1
        }
    }
    return del
}