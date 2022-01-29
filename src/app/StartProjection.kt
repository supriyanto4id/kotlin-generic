package app



fun displayLength(arr :Array<*>){
    println("Total arr is ${arr.size}")
}
fun main() {

    val arrayInt:Array<Int> = arrayOf(1,2,3,4,5)
    val arrayString:Array<String> = arrayOf("Supri", "Alika", "Silda","Dimas")
    
    println(displayLength(arrayInt))
    println(displayLength(arrayString))
}