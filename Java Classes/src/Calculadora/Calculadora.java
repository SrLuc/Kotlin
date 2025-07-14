package Calculadora;

public class Calculadora {

    public int multiplicar(int a, int b) {
        int resultado = 0;
        boolean negativo = false;

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            negativo = true;
        }

        if (a < 0) {
            a = -a;
        }

        if (b < 0) {
            b = -b;
        }

        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        if (negativo) {
            resultado = -resultado;
        }

        System.out.print("O resultado é: ");
        return resultado;
    }

    public int dividir(int a, int b) {
        int resultado = 0;
        boolean negativo = false;

        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            negativo = true;
        }

        if (a < 0) {
            a = -a;
        }

        if (b < 0) {
            b = -b;
        }

        while (a >= b) {
            a -= b;
            resultado++;
        }

        if (negativo) {
            resultado = -resultado;
        }

        System.out.print("O resultado é: ");
        return resultado;
    }

    public int fatorial(int n) {
        if (n == 0 || n == 1) {
            System.out.print("O resultado é: ");
            return 1;
        }

        int resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado = multiplicar(resultado, i);
        }

        System.out.println("O resultado é: ");
        return resultado;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.multiplicar(3, -4));   // -12
        System.out.println(calc.dividir(10, 3));      // -5
        System.out.println(calc.fatorial(4));          // 120
    }
}
