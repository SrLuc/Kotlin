//IF ELSE EXPRESSION

var age = 20
val name = "John"

if (age >= 18) {
    println("$name is an adult.")
} else {
    println("$name is a minor.")
}

// WHEN EXPRESSION
var number = 3
when (number){
    1 -> println("number 1")
    2 -> println("number 2")
    3 -> println("number $number")
    else -> println("number not found")
}

// WHEN EXPRESSION WITH RANGE
var score = 85
when (score) {
    in 90..100 -> println("Grade A")
    in 80..89 -> println("Grade B")
    in 70..79 -> println("Grade C")
    in 60..69 -> println("Grade D")
    else -> println("Grade F")
}

// WHEN EXPRESSION WITH TYPE CHECKING
val age = 18
when {
    age < 18 -> println("Minor")
    age in 18..45 -> println("Adult")
    else -> println("Senior")
}

// WHEN EXPRESSION WITH MULTIPLE CONDITIONS
val heigth = 5
when(heigth){
    1,2,3 -> println("Tiny")
    4..6 -> println("Small")
    else -> println("Big")
}

// WHEN EXPRESSION WITH ARBITRARY CONDITIONS
number = 10
when{
    number %2==0 -> println("Even")
    number %2!=0 -> println("Odd")
    else -> println("Not a number")
}