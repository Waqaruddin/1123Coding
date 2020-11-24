

fun main(){

    var a = arrayOf("Adam", "Bill")
    var b = arrayOf("13", "234")
    var p = "2"

    println(phoneBook(a,b,p))
}

fun phoneBook(a:Array<String> , b:Array<String>, p:String):String{

    var output:ArrayList<String> = ArrayList()
    for(i in b.indices){
        if(b[i].contains(p)){
            output.add(a[i])
        }
    }
    return if(output.isEmpty()){
        "No Contact"
    }else{
        output.sort()
        output[0]
    }
}

