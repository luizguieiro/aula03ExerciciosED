package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int quantidadeDeNumeros = scanner.nextInt();

        int[] pares = new int[quantidadeDeNumeros];
        int[] impares = new int[quantidadeDeNumeros];

        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares[countPares] = numero;
                countPares++;
            } else {
                impares[countImpares] = numero;
                countImpares++;
            }
        }

        pares = Arrays.copyOf(pares, countPares);
        impares = Arrays.copyOf(impares, countImpares);

        Arrays.sort(pares);
        Arrays.sort(impares);

        System.out.println("Números pares ordenados: " + Arrays.toString(pares));

        System.out.println("Números ímpares ordenados: " + Arrays.toString(impares));

        scanner.close();
    }
}