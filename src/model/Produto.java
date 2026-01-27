package model;

public class Produto {

    // 1️⃣ ATRIBUTOS
    private String nome;
    private int quantidadeEmEstoque;

    // 2️⃣ CONSTRUTOR
    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;

        if (quantidadeInicial < 0) {
            this.quantidadeEmEstoque = 0;
        } else {
            this.quantidadeEmEstoque = quantidadeInicial;
        }
    }

    // 3️⃣ MÉTODOS DE NEGÓCIO
    public void entradaEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para entrada.");
            return;
        }
        quantidadeEmEstoque += quantidade;
    }

    public void saidaEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para a saída.");
            return;
        }
        if (quantidade > quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente.");
            return;
        }
        quantidadeEmEstoque -= quantidade;
    }

    // 4️⃣ MÉTODO DE EXIBIÇÃO (AQUI 👇)
    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    // 5️⃣ GETTERS
    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}

