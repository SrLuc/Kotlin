//LOOPS and ITERATION

// 1. For Loop
for (count in 1..10) { // Itera de 1 a 10 (inclusive)
    println("Count: $count")
}

val fruits = listOf("Apple", "Banana", "Cherry")
for (fruit in fruits){
    println("Fruit, $fruit")
}

var numbers = listOf(1, 2, 3, 4, 5)
for (number in numbers) {
    println("Number: $number")
}

var persons = listOf("Alice", "Bob", "Charlie")
for (person in persons) {
    println("Person: $person")
}

// Iterar sobre un range
for (i in 1..5) { // Itera de 1 a 5 (inclusive)
    println("Number: $i")
}   

// Iterar sobre un range con paso
for (i in 1..10 step 2) {
    println("Number: $i")
}

var sizes = listOf("Small", "Medium", "Large")
for (size in sizes until 2) { // Itera de 0 a 1 (exclusive)
    println("Size: $size")
}

// 2. While Loop
var i = 0
while (i < 5) {
    println("While Loop: $i")
    i++
}

// 3.repeat Loop
repeat(5) {
    println("Repeat Loop")
}

// repeat with index
repeat(5) { index ->
    println("Repeat Loop: $index")
}

