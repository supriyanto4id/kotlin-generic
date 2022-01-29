package data

class Function (val name:String){
    fun <T>sayHallo(param :T){
        println("Hello $param, my name is $name")
    }
}