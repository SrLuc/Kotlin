data class Fighter(


    private val id: Int,
    val name: String,
    val health: Int,
    val attack: Int,
    val defense: Int
) {
    fun isAlive(): Boolean = health > 0

    fun attack(opponent: Fighter): String {
        return "$name attacked ${opponent.name} and his life decreased to: ${opponent.health - attack}"
    }
}

val baraka = Fighter(1, "Baraka", 100, 20, 10)
val milena = Fighter(2, "Milena", 100, 10, 20)

fun main() {
    println(milena.attack(baraka))
}
