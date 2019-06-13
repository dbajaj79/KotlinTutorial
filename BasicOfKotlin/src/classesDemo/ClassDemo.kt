package classesDemo

import classesDemo.inhritance.Car
import classesDemo.inhritance.Dog
import classesDemo.inhritance.LCD

fun main() {

    val  simpleClass = SimpleClass()
    println(simpleClass.title)
    println(simpleClass.description)
    simpleClass.description = "Description is Changed"
    simpleClass.title = "I am Simple Class"
    println("Simple Class After Value Changed")
    println(simpleClass.title)
    println(simpleClass.description)
    val person = Person("Deepak",35)
    person.speak()
    person.greet("Khem Singh")

    //Inheritance Using Open Class
    val car = Car("Green","Wagon R","Maurti Suzuki","Car")
    car.breakSystem()
    car.changeGear()

    val dog = Dog(age = 20,color = "Brown",breed = "Alassion",type = "Dog")
    dog.speak()
    dog.eat()

    val lcd = LCD()
    lcd.display()
    lcd.print()




}