package Calculadora;

public class ExemploCalculadora {

    public int multipilicar(int a, int b){

        int resultado = 0;
        boolean negativo = false;

        if((a<0&&b>0) || (a>0&&b<0)){
            negativo = true;
        }

        if (a <0){
            a = -a;
        }

        if (b <0){
            b = -b;
        }

        for (int i = 0; i < b; i++) {
            resultado = resultado + a;
        }

        if (negativo == true){
            resultado = -resultado;
        }

        return resultado;
    }


    public int fatorial(int n){
        if (n == 0){
            return 1;
        }

        int resultado = 0;
        boolean negativo = false;

        for (int i = 1; i <= n; i++) {
            resultado = resultado + multipilicar(n,(n-i));
        }
        return resultado;
    }
}
