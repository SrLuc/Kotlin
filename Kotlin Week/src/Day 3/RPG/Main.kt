package RPG

import com.sun.jdi.Value

fun main(){
    val char1 = Char("Goku", 100, 20, 5)
    val char2 = Char("Vegeta", 80, 50, 8)

    BattleManager.initBattle()

    while(char1.health > 0 && char2.health >0){
        BattleManager.fight(char1,char2)
    }


}