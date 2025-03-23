package exercicios;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os números (digite '0' para terminar):");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            numeros.add(numero);
        }

        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            int soma = 0;
            for (int num : numeros) {
                soma += num;
            }
            double media = (double) soma / numeros.size();

            int maior = numeros.get(0);
            for (int num : numeros) {
                if (num > maior) {
                    maior = num;
                }
            }

            System.out.println("\nResultados:");
            System.out.println("Média dos números: " + media);
            System.out.println("Maior número: " + maior);
        }

        scanner.close();
    }
}