package classesDemo.inhritance

import javax.print.attribute.standard.PrinterMoreInfoManufacturer

class Truck(override val color:String,override val model:String,override val manufacturer:String, override val name:String):Vechicle(color,model,manufacturer,name) {


}