package EP4;

import java.util.Scanner;

public class LeitordeStringTurbinado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ultimas = new String[15];

        int pos = 0;
        int contador = 0;
        int maiorString = 0;

        StringBuilder sb = new StringBuilder();

        boolean lendo = true;

        while (lendo) {

            System.out.print("Digite uma palavra: ");
            String atual = sc.next();

            boolean existe = false;

            for (int i = 0; i < ultimas.length; i++) {
                if (ultimas[i] != null && ultimas[i].equals(atual)) {
                    existe = true;
                }
            }

            if (existe) {
                lendo = false;
            } else {
                ultimas[pos] = atual;
                pos = (pos + 1) % 15;
                contador++;

                if (atual.length() > maiorString) {
                    maiorString = atual.length();
                }

                sb.append(atual);
            }
        }

        sc.close();

        System.out.println("Número de Strings lidas: " + contador);
        System.out.println("Tamanho da maior String: " + maiorString);
        System.out.println("Concatenação: " + sb.toString());
    }
}

