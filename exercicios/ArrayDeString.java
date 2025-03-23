package exercicios;

import java.util.Scanner;

public class ArrayDeString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas palavras serão verificadas? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        String[] palavras = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
        }

        System.out.println("\nPalavras palíndromas encontradas:");
        for (String palavra : palavras) {
            if (VerificarPalindromos(palavra)) {
                System.out.println(palavra);
            }
        }

        scanner.close();
    }

    public static boolean VerificarPalindromos(String palavra) {

        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false; // nao é palíndromo
            }
            esquerda++;
            direita--;
        }
        return true; // é  palindromo
    }
}
