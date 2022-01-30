package app

class GenericExtensionFunction<T>(val data: T)

fun GenericExtensionFunction<String>.print(){
    val data : String = this.data
    println(data)
}

fun GenericExtensionFunction<Int>.printInt(){
    val data : Int= this.data
    println(data)
}

fun main() {
    val data =GenericExtensionFunction("Data ku")
    println(data.data)

    val dataInt =GenericExtensionFunction(12)

    println(dataInt.data)

}