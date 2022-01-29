package app

class Contravariant <in T>{
    fun sayHallo(param:T){
        println("Hello $param")
    }
}

fun main(){
    val contravariAny = Contravariant<Any>()

    val contravariantString:Contravariant<String> =contravariAny

    contravariantString.sayHallo("Eko")
}