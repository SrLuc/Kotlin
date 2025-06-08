
/*
Desafio 1: Calculadora Básica com When
Objetivo: Criar uma função que simule uma calculadora básica, utilizando operadores e a estrutura when.

Descrição:
Crie uma função chamada calcular que receba três parâmetros:

num1: um número inteiro (Int)
num2: outro número inteiro (Int)
operador: uma string (String) que pode ser "+", "-", "*", ou "/".
A função deve retornar o resultado da operação. Utilize uma expressão when para verificar qual operador foi passado e realizar a operação correspondente. Lembre-se de tratar o caso de divisão por zero, retornando uma mensagem de erro ou um valor específico (por exemplo, Double.NaN para "Not a Number" ou lançando uma exceção se já tiver visto tratamento de erros, mas para o Dia 1, uma mensagem simples ou um valor sentinela já serve).

Conceitos aplicados: Variáveis, Tipos, Operadores, Funções, If/Else/When.
*/

fun main(){
    calculate(20,2,"#")
}

fun calculate(num1:Int, num2:Int, operador:String){
    when (operador){
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1 / num2)
        else -> println("its not a valid operator!")
    }
}