package app

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(param:T): ObservableProperty<T>(param) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("before chaeng ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {

        println("After change ${property.name} from $oldValue to $newValue")
    }

}

class Car(brand:String, year:Int){
    var beand:String by LogObservableProperty(brand)
    var year:Int by LogObservableProperty(year)
}

fun main() {
    var car = Car("Daihatsu",2012)

    car.beand= "Toyota"

    println("breand ${car.beand} and year = ${car.year}")


}