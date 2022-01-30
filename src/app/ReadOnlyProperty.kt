package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ReadOnlyProperty (val data:String): ReadOnlyProperty<Any,String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
       println("Access property ${property.name} with value $data")
    return data.toUpperCase()
    }
}

class NameWithLog(param:String){
    val name:String by ReadOnlyProperty(param)

}

fun main(){
    val namewithLog =NameWithLog("Supriyanto")

    println(namewithLog.name)
}