//Functions 

fun simpleFunction() {
    println("Hello, World!")
}

fun functionWithParameters(name: String) {
    return "Hello, $name!"
}

fun functionWithDefaultParameters(name: String = "World") {
    return "Hello, $name!"
}

fun functionWithReturnType(name: String): String {
    return "Hello, $name!"
}

fun functionWithVararg(vararg names: String) {
    for (name in names) {
        println("Hello, $name!")
    }
}

// Main function its the entry point of the program in Kotlin
// It is where the program starts executing
// It is similar to the main function in other programming languages
// such as C, C++, Java, etc.
fun main() {
    simpleFunction()
    println(functionWithParameters("Kotlin"))
    println(functionWithDefaultParameters())
    println(functionWithReturnType("Kotlin"))
    functionWithVararg("Kotlin", "Java", "Python")
}