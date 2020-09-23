package examples.rsantillanc.indroduction

//Los androides


fun main(){
    val ren = "Renzo Santillán"
    "" welcome ren
}

//1. Making infix functions
infix fun String.welcome(name: String) = print("Welcome to Androides $name!")