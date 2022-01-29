package app

class Invariant <T>(val data:T)

fun main(){
    val invariantString=Invariant("String")

//    val invariant:Invariant<Any> =invariantString
//    invariant.data =100
}


