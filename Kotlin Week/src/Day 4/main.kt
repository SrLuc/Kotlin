    fun main(){

        //Tratamentos de Erros com Throw

        fun divider(a:Int, b:Int):Int{
            if (a == 0 || b == 0) {
                throw IllegalArgumentException("\nDivision by zero not supported")
            }
            return a / b
        }


        //Criando os própios tratamento de erros
        class meuErroCustomizado(msg:String):Exception(msg)
        fun dividerAgain(a:Int, b:Int):Int{
            if (a == 0 || b == 0){
                throw meuErroCustomizado("\nDivision by zero not supported")
            }
            return a / b
        }

        divider(2,1)
        divider(3,0)
    }

