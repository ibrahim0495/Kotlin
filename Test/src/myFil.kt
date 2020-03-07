fun printHello(){
    println("Hello world !")
}

fun test1(){
    val nb1:Int = 50
    when(nb1){
        0 -> println("c'est egale a zero")
        in 1..100 -> println("compris entre 1 et 100")
        else -> println("pas dans l'intervale concernee")
    }
}

fun testList(){
    var newschoo= arrayOf("ISM",1,"SupDeco")
    var school= arrayListOf<String>("Thies","Bambey","Dakar")
    for (element in school){
        println("$element ")
    }

    println(java.util.Arrays.toString(newschoo))

    var myA= Array(5){it*2}
    println(java.util.Arrays.toString(myA))
}

fun fish(day:String):String{
    return when(day){
        "Monday" -> "Capitaine"
        else -> "Yaboy"
    }
}

fun eatFish(day: String,holiday:String, regime:String):Boolean{
    return when{
        day == "Friday" -> true
        holiday == "Eastern" -> true
        regime == "Vegetarian" -> true
        else -> false
    }
}

fun isHot(temp:Int):Boolean{
    return temp >25
}

val waterFilter= {dirty:Int -> dirty/2}

// higher order fuction
fun updateDirty(dirty:Int, operation:(Int) -> Int):Int{
    return operation(dirty)
}
fun gg():(Int) -> Int= {x-> x+1}
fun methodeFiltre(x:Int):Int{
    return  x-1
}
val methodeUV:(Int) -> Int= {x -> x-2}

fun methodeCachet(): (Int) -> Int={x -> x-3}

//Lambda
val f:(Int) -> Int= {x -> x+1}
val length:(String) -> Int= {input -> input.length}

//fonction avec return, avec =
fun square(n:Int)= n * n
fun p(m:Int): Unit{
    println("Hello $m")
}

fun main (args:Array<String>){
    println("Fonction higher order")
    println(updateDirty(10,::methodeFiltre))
    println("***********************************")
    println(updateDirty(10,methodeCachet()))
    println("***********************************")
    println(updateDirty(10,{x -> x-6})) // last parameter call syntax
    println("Fonction return et avec =")
    println(square(5))
    println("***********************************")
    println(p(2))
}