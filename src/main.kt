//create a class human with attributes name,age,weight

fun main(){
var mercy=Human("Winnie",40,60)
Winnie.eat(5)
    println(Winnie.weight)
    //passes string passed to it
    mercy.speak("hello")

//increments age by one
    mercy.birthday(40)
    println(mercy.age)

//create and print two instances of the class.
    var details= User("mercy","yugi","mercyyugi@gmail.com", 2546786356,"mercy5677")
    println(details.password)
    println(details.email)


}

class  Human(var name: String, var age: Int, var weight:Int){
    fun eat(foodWeight: Int):Int{
        weight += foodWeight
        println("i am eating $foodWeight kgs of food")
        return foodWeight
    }

    fun speak(speech: String){
        println(speech)
    }

    fun birthday(birthday:Int){
        age++

    }
}
data class User (var firstName: String, var lastName: String, var email: String, var phoneNumber: Long, var password: String){

}
