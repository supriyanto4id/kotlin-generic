package app

class Covariant<out T>(val data: T) {
 fun data():T{
     return data
 }
}

fun main(){
    val covariantString =Covariant<String>("Supri")
    val covariant:Covariant<Any> =covariantString

    println(covariant.data)
}