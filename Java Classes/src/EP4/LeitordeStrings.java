package EP4;

import java.util.Scanner;

public class LeitordeStrings {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        boolean leitor = true;

        int contador = 0;
        int maiorString = 0;

        String anterior = "";
        String atual;

        while(leitor) {
            System.out.print("Digite o uma palavra: ");
            String palavra = sc.next();
            atual = palavra;

            if (atual.equals(anterior)) {

                leitor = false;
            }else {
                anterior = palavra;
                sb.append(atual);
            }


            if(atual.length() > maiorString) {
                maiorString = atual.length();

            }
            contador++;
        }

        sc.close();
        System.out.println("Número de Strings lidas: " + contador);
        System.out.println("Tamanho da maior String: " + maiorString);
        System.out.println("Concatenação: " + sb.toString());
    }
}
