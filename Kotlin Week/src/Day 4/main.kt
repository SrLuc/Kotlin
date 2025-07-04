    fun main(){
        //Tratamentos de Erros com Throw

        fun divider(a:Int, b:Int):Int{
            if (a == 0 || b == 0) {
                throw IllegalArgumentException("\nDivision by zero not supported")
            }
            return a / b
        }


        //Criando os própios tratamento de erros
        class MeuErroCustomizado(msg:String):Exception(msg)

        fun dividerAgain(a:Int, b:Int):Int{
            if (a == 0 || b == 0){
                throw MeuErroCustomizado("Estourou aqui")
            }
            return a / b
        }

        println("\nDivision by zero")
        //divider(2,0)
        dividerAgain(3,0)
    }

