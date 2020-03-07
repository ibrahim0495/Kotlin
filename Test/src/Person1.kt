open class Person1 (val firstName: String, val lastName: String, val age: Int){

    var single: Boolean= true
        get() {
            return field
        }
        set(value) {
            field= value
        }

    lateinit var maredName: String

    fun greet(p: Person1){
        // p dit bonjour a this
        println("${p.firstName} dit bonjour a ${this.firstName}")
    }

    fun isGettingMaried(){
        this.single= false
    }


    fun present(){
        println("Hello $firstName $lastName")
    }

    // constructeur secondaire et on doit l'ecrire en fonction du constructeur primaire
    constructor(firstName: String, lastName: String): this(firstName,lastName,18)

    init {
        println("Creation d'objet")
    }
}

//class Employer (firstName: String, lastName: String, age: Int), var salay:Int): Person1(firstName,lastName,age)


fun main (args:Array<String>){
    var p = Person1("Modou","FALL",20) // cree une personne
    println(p.firstName+" "+p.lastName+" "+p.age)

    // le constructeur Person1() n'existe plus
    // Getters and Setters existent

    println("***********************************")
    var p1= Person1("Ibrahim","DATTE")
    println(p1.firstName+" "+p1.lastName+" "+p1.age)
    println("***********************************")
    p1.greet(p)
    println("***********************************")
    println(p.equals(p1)) // return false
    println(p==p1) // return false

}