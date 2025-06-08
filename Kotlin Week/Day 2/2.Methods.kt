package `Day 2`


fun main(){

    //.map transforma cada item da lista []
    val numeros = listOf(1,2,3,4,5,6)
    val doubles = numeros.map { it * 2 }
    println(doubles)


    //.filter filtra os elemetos com base numa condição
    val pares = numeros.filter { it % 2 == 0 }
    println(pares)


    //.find encontra um elemento que bate com a condição
    val maiorque = numeros.find { it > 5 }
    println(maiorque)

    //.reduce pega tudo de uma lista e reduz a um unico valor
    val somaDaLista = numeros.reduce { acumulador,valor -> acumulador +valor }
    println(somaDaLista)
}