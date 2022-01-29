package app

import data.MyData

fun main(){
    val myData: MyData<String, Int> =MyData<String, Int> ("Supri",150)
    myData.printData()

    val myDataInt:MyData<Int, String> = MyData<Int,String>(100, "Yanto")
    myDataInt.printData()

}