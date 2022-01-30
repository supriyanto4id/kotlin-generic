package app

import java.awt.image.FilteredImageSource
import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringReadWriteProperty(var data:String):ReadWriteProperty<Any,String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
       println("get property ${property.name}")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("set property ${property.name} from $data to $value")
        data=value
    }
}

class Person(param:String){
    var name:String by StringReadWriteProperty(param)
}

fun main() {
    val person =Person("Supri")

    person.name ="Dimas"

    println(person.name)
}
