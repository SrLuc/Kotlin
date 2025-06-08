package `Day 2`.List

fun main(){

    //List é o Array e é usado de duas formas
    val fruits = listOf<String>("Apple", "Banana", "Pear", "Grape")
    println(fruits)

    //Mutable Lista são lista onde pode add,remover e alterar
    val peoples = mutableListOf<String>("Jonh", "Karla", "Mary")
    peoples.add("Jake")
    println(peoples)

    //Set é uma estrutura de dados que não permite elementos repetidos
    val numeros = setOf<Int>(1,2,3,4,5,6,7,8,9,10)
    println(numeros)

    //Mas se quiser adicionar ou remover...
    val maisNumeros = mutableSetOf<Int>(1,2,3,4,5)

    //adiciona no final do Set
    maisNumeros.add(6)

    //remove o elemento = X
    maisNumeros.remove(2)
    println(maisNumeros)

    // Map é um forma de escrever o corpo e valor de um objeto de dentro de uma função
    val user = mapOf("name" to "John", "age" to 30, "address" to "New York")
    println(user)

    //Os valores são acessados pelos seus indices
    println(user["name"])
    println(user["age"])

   //Map mutável
    val sound = mutableMapOf(
        "Dekel" to "progressive"
    )
    sound["Gorovich"] = "Acid Progressive"
    sound["Vegas"] = "Hipnotic Trance"
    println(sound)

    sound["Vegas"] = "cachorrada"
    println(sound)







}


