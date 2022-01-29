package app

class Container<T>(var data:T)


//copy projectionsudo
fun copyContainer(from:Container<out Any>, to: Container<in Any>){
    to.data =from.data
}

fun main() {
   val container1 = Container("Supri")
    val container2 :Container<Any> = Container("Yanto")

    copyContainer(container1,container2)
    println(container1.data)
    println(container2.data)
}