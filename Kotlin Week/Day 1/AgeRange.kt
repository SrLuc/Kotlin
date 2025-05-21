/*
Desafio 2: Classificador de Faixa Etária
Objetivo: Desenvolver um programa que classifique a idade de uma pessoa em diferentes categorias, usando if/else if/else ou when.

Descrição:
Escreva um programa que peça ao usuário para digitar sua idade. Com base na idade fornecida, o programa deve imprimir uma das seguintes classificações:

"Criança" (0 a 12 anos)
"Adolescente" (13 a 18 anos)
"Adulto" (19 a 60 anos)
"Idoso" (acima de 60 anos)
Conceitos aplicados: Variáveis, Tipos, Operadores de comparação, If/Else/When.
*/

fun main(){
    println(defineByAge(45))
}

fun defineByAge(age:Int):String{
    return when(age){
       in 0..12 -> "Child"
       in 13..18 -> "Young"
       in 19..60 -> "Adult"
       in 60..100 -> "Older"
       else -> "N/A"
    }
}