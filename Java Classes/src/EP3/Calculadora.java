package EP3;
import java.util.Scanner;


public class Calculadora {

    Scanner sc = new Scanner(System.in);

    public int multiplicar() {

        int resultado = 0;
        boolean negativo = false;

        System.out.print("Digite o primeiro termo: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo termo: ");
        int b = sc.nextInt();

        if((a<0 && b>0) || (a>0 && b<0)) {
            negativo = true;
        }


        if (a<0) {
            a = -a;
        }

        if (b<0) {
            b = -b;
        }


        for (int i=0; i<b; i++) {
            resultado +=a;
        }

        if(negativo) {
            resultado = -resultado;
        }

        System.out.print("O resultado é :");
        return resultado;
    }

    public int dividir() {



        int resultado = 0;
        boolean negativo = false;

        System.out.print("Digite o primeiro termo: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo termo: ");
        int b = sc.nextInt();

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

    public int multiplicarTest(int a, int b) {

        int resultado = 0;
        boolean negativo = false;


        if((a<0 && b>0) || (a>0 && b<0)) {
            negativo = true;
        }


        if (a<0) {
            a = -a;
        }

        if (b<0) {
            b = -b;
        }


        for (int i=0; i<b; i++) {
            resultado +=a;
        }

        if(negativo) {
            resultado = -resultado;
        }

        System.out.print("  O resultado é :" + resultado);
        return resultado;
    }


    public int dividirTest(int a, int b) {
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

        while (a >= b) {
            a -= b;
            resultado++;
        }

        if (negativo) {
            resultado = -resultado;
        }


        System.out.print(" O resultado é: " + resultado);
        return resultado;

    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //System.out.println(calc.multiplicar());
        System.out.println(calc.dividir());
    }


}
