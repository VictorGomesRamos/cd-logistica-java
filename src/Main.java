import service.EstoqueService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EstoqueService estoqueService = new EstoqueService();

        int opcao;

        do {
            System.out.println("\n=== MENU ESTOQUE ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Entrada de estoque");
            System.out.println("3 - Saída de estoque");
            System.out.println("4 - Consultar estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Nome do produto: ");
                        String nome = scanner.nextLine();

                        System.out.print("Quantidade inicial: ");
                        int quantidade = scanner.nextInt();

                        estoqueService.cadastrarProduto(nome, quantidade);
                        System.out.println("Produto cadastrado com sucesso!");
                    }

                    case 2 -> {
                        System.out.print("Nome do produto: ");
                        String nome = scanner.nextLine();

                        System.out.print("Quantidade de entrada: ");
                        int quantidade = scanner.nextInt();

                        estoqueService.entradaEstoque(nome, quantidade);
                    }

                    case 3 -> {
                        System.out.print("Nome do produto: ");
                        String nome = scanner.nextLine();

                        System.out.print("Quantidade de saída: ");
                        int quantidade = scanner.nextInt();

                        estoqueService.saidaEstoque(nome, quantidade);
                    }

                    case 4 -> estoqueService.listarProdutos();

                    case 0 -> System.out.println("Encerrando sistema...");

                    default -> System.out.println("Opção inválida!");
                }
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        scanner.close();
    }
}
