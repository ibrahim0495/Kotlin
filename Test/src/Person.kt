class Person{
    val firstName : String ="A"
    val lastName: String= "B"
    var age : Int= 10


}
fun main (args:Array<String>){
    var p: Person= Person() // cree une personne
    println(p.firstName) // getter
    p.age= 15
}