/*
Desafio 3: Soma de Números Pares em um Intervalo
Objetivo: Calcular a soma de todos os números pares dentro de um intervalo específico, utilizando um loop for.

Descrição:
Escreva um programa que calcule e imprima a soma de todos os números pares de 1 a 100 (inclusive). Você deve usar um loop for para iterar sobre o intervalo e um operador para verificar se o número é par.

Conceitos aplicados: Variáveis, Tipos, Loops (for), Operadores (módulo %).
*/
fun main(){
    sumRange(10)
}

fun sumRange(range:Int){
    var sum = 0
    for(i in 0..range){
        if(i%2==0){
            sum = sum + i
        }
    }
    println("Soma de todos os pares dentro do range de $range é: $sum")
}



