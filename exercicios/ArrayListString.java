package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}

public class ArrayListString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Buscar contato pelo nome");
            System.out.println("3 - Exibir todos os contatos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();
                    contatos.add(new Contato(nome, telefone));
                    System.out.println("Contato cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBusca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contato contato : contatos) {
                        if (contato.nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Contato encontrado: " + contato);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("\nLista de contatos:");
                        for (Contato contato : contatos) {
                            System.out.println(contato);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Tchau Tchau...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}