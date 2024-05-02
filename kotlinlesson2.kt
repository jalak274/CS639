// This is code of excercise for kotlin lesson 2 

import java.util.*   

val birds = listOf ("Pigeons", "Hummingbird", "Flamingo", "Toucan", "Peacock","Crow","Cardinal")

fun main() {

    val temp = 20
    val isHot = if (temp > 40) true else false
    println(isHot)
 
    printHello("Jalak")

    println( birds.filter { it[0] == 'c'})
    
    val c_birds = birds.filter { it[0] == 'c' }
    println("c_birds: $c_birds")

    val filtered = birds.asSequence().filter { it[0] == 'c' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = birds.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = birds.asSequence().filter {it[0] == 'c'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")

    val numbers = setOf(7, 8, 9)
    println(numbers.map { it * 3 })

    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
    println(numberSets.flatten())

    val mysports = listOf(cricket", "football", "rugby")
    val myplayers = listOf("Ronaldo", "Messy", "Virat")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
}

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

val enc1: (String) -> String = { input -> input.toUpperCase() }
println(encodeMsg("abc", enc1))

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
   return operation(dirty)
}

fun increaseDirty(start: Int): Int {
    return start + 1
}

fun printHello(name: String?) {
    println("Hi there!")
}


fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    val dirtyLevel = 19
    val updatedDirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(updatedDirtyLevel)
}
