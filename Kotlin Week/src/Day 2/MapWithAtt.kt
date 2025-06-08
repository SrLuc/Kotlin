/*
Você tem um MutableMap que guarda produtos e seus preços:

val precos = mutableMapOf("banana" to 2.5, "maçã" to 3.0, "laranja" to 4.0)

Adicione um produto novo com preço

Atualize o preço da maçã para 5.5

Remova a banana do mapa

Imprima o mapa no formato Produto: preço
 */


fun main(){
    val prices = mutableMapOf("Banana" to 2.5, "apple" to 3.5, "Grape" to 4.6)
    prices["Pineaple"] = 2.5
    prices["apple"] = 5.5
    prices.remove("Banana")
    println(prices)
}



