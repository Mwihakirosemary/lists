fun main(){
    var a = myHeigt(1.70)
    var b = myHeigt(1.55)
    var c = myHeigt(1.65)
    var d = myHeigt(1.75)
    var p = listOf(a,b,c,d)


    var one = Person("Swabrina",21,5.5,57)
    var two = Person("kiki",22,5.7,52)
    var three = Person("Rose",23,5.2,51)
    var four = Person("Mercy",20,4.5,55)
    var t = listOf(one,two,three,four)
    var x = t.sortedByDescending { persons -> persons.age }
    println(x)
    var five = Person("Salma",19,4.7,50)
    var six = Person("Akuot",24,5.8,60)
    var y = listOf(five,six)
    println(x.plus(y))

    var crs = car("KCXI24",30)
    var toyota = car("KAZ264",56)
    var audi = car("KBC293",80)
    var myCabs = listOf(crs,toyota,audi)
    println(myCars(myCabs))


}

class myHeigt(var Height: Double){

}
data class Person(var name: String,var age: Int,var height: Double,var weight: Int)
fun mtu(person1:List<Person>):List<Any>{
    return listOf()

}

data class car(var registration: String,var miliage: Int)
fun myCars(cabs: List<car> ): Int {
    var g = 0
    cabs.forEach { w ->
        w.miliage
        g += w.miliage
    }
    var mlg = g/cabs.count()
    return mlg
}

