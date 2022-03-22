fun  main(){
    myInvoke()                       // invoking the characters of AkiraChix name
    myParemeter("Mercy", 20)   // invoking the name and age in a parameter
    myFun()                          // invoking the length of a string.
    myName()                          // invoking if am else (if not)
}
//Given a string “AkiraChix”. Write a function that prints out a
// string composed of the first, third and fourth characters of the
// string (2 points)
fun myInvoke() {

    var name = "AkiraChix"
    println(name[0].toString()+name[2]+name[3])     // Since a string is a sequence of characters we can obtain individual characters from
    // a string using the index operator . The first character is []
    //    index 0 and the second one index 1

}
//Write a function that takes in 2 parameters, name and age and returns a String with this structure
// “Hi, my name is x and I am y years old.” Where x and y are
// the provided name and age respectively. (3 pts)

fun myParemeter(x:String, y:Int) {
    println("Hi, my name is"+" "+x+" "+"and I am"+" "+y+" "+"years old.")  // Kotlin Strings are concatenated using the + operator
}

//Write a function that takes in a String and returns its length (2 points)
fun myFun(){
    var s= "Lucy"
    println(s.length)
    println(s.uppercase())
    println(s.capitalize())                  // to put in the first character in capital letter
    // using the inbuilt function

}

//Write a function that takes in a name and prints out
// “That’s me!” when your name is passed to it, otherwise it prints out
// “I don’t know who that is” (3 pts)
fun myName(){
    var person = "Mercy"
    var person2 = "Dallen"
    if ( person == person2){
        println("That's me")
    }else {
        println("I don't know who that is")
    }
}