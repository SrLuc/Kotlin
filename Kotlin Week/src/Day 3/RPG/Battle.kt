package RPG

object BattleManager{

    fun initBattle(){
        println("Iniciando batalha!")
    }

    fun fight(char1: Char, char2:Char){
        char2.health = char2.health - char1.damage
        char1.health = char1.health - char2.damage

        println("${char1.name} atacou ${char2.name} que perdeu ${char1.damage} de vida!")
        println("${char2.name} atacou ${char1.name} que perdeu ${char2.damage} de vida!")

        isAlive(char1)
        isAlive(char2)
        winner(char1, char2)
    }

    fun isAlive(char:Char){
        when{
            char.health <= 0 -> println("${char.name} Morreu!")
            else -> println("Continua a vida de ${char.name}: ${char.health}")

        }
    }

    fun winner(char1: Char,  char2:Char){
        when{
            char1.health <= 0 && char2.health <= 0 -> println("Empate!")
            char1.health <= 0 -> println("${char2.name} venceu!")
            char2.health <= 0 -> println("${char1.name} venceu!")
            else -> println("Batalha ainda continua")
        }
    }
}