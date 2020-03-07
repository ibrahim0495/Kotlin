data class Person2(val nom:String,var age:Int)

fun main (args:Array<String>){
    val p1= Person2("A",10)
    val p2= Person2("A",10)
    println(p1==p2) // return true
    println(p1.equals(p2)) // return true
    println(p1===p2) // return false
}