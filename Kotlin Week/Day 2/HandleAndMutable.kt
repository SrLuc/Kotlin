package `Day 2`

/*
2. Manipula MutableList

Crie uma MutableList de strings com nomes de frutas.

Depois:
- Adicione uma fruta nova

- Remova a segunda fruta da lista

- Imprima cada fruta em maiúsculo, uma por linha (usa forEach)

* */

fun main(){
    val fruitsList = mutableListOf<String>("apple","orange","grape")
    fruitsList.add("pineaple")
    fruitsList.remove(fruitsList[1])
    return fruitsList.forEach { println(it.uppercase()) }
}



