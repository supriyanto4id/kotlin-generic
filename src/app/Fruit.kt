package app

class Fruit(val name:String, val quantity:Int): Comparable<Fruit>{
    override fun compareTo(other: Fruit): Int {
       return quantity.compareTo(other.quantity)
    }


}

fun main(){
    val fruit1= Fruit("mangga",100)
    val fruit2=Fruit("mangga",10)

    println(fruit1>fruit2)
}