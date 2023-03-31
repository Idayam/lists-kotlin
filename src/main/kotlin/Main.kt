fun main() {
println(stmt())
println(people())
    println(human())
    println(car())

}


//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun stmt():List<String> {
    val m = mutableListOf("back", "bag", "read", "cup", "girl", "mother", "pen", "food", "book", "apple")
    val evenindices = m.filterIndexed { index, _ -> index % 2 == 0 }
    return evenindices
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person (var name:String, var age:Int, var height:Double, var weight:Double )
fun people(){
    val boy = Person("Ahmed", 28, 1.82, 70.5)
    val girl = Person("Halima" ,10, 1.47, 43.8)
    val son = Person("Ali", 22, 1.56, 60.2)
    val y = listOf(boy,girl,son)
    var sorted=y.sortedByDescending { person1->person1.age }
    println(sorted)
}
// Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peopleHeight(heights:List<Double>):Double{
    val averageheight= heights.average()
    val totalHeight= heights.sum()
    println(averageheight)
    return(averageheight)
    println(totalHeight)
    return (totalHeight)
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
fun human(){
    val mother =Person("Idaya", 24, 1.70, 52.0)
    val daughter = Person("Sasha", 26, 1.63, 70.9)

}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String, var mileages:Double)
fun car():Double{
    val mercedes = Car("KDB23", 26.5)
    val ford = Car("KFS74", 18.0)
    val toyota=Car("KGT65", 14.5)
    val Cars = listOf(mercedes,ford,toyota)
    val total = listOf(mercedes,ford,toyota)
    var totalmilleage=total.sumOf { mileage->mileage.mileages }
    var averageMilleage=totalmilleage/total.size
    return averageMilleage
}





