/*
1. Filtra e transforma

Você tem uma lista de números inteiros.

Crie uma função que:
 - Filtra só os números pares
 - Multiplica cada número par por 3
 - Retorna a lista resultante

*/

fun main(){
    val numeros = listOf(1,2,3,4,5,6,7,8,9,10)
    println(filterAndTransform(numeros))
}

fun filterAndTransform(numeros:List<Int>): List<Int> {

    println("Filtrando os pares..")
    val pares = numeros.filter { it % 2 == 0}
    println(pares)

    println("multiplicando por 3..")
    val multiplicador = pares.map { it * 3}
    return multiplicador
}