package model;

public class Produto {

    private String nome;
    private int quantidadeEmEstoque;

    public Produto(String nome, int quantidadeEmEstoque) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do produto inválido");
        }
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void entradaEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade para entrada deve ser positiva");
        }
        quantidadeEmEstoque += quantidade;
    }

    public void saidaEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida para saída");
        }

        if (quantidade > quantidadeEmEstoque) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }

        quantidadeEmEstoque -= quantidade;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Estoque: " + quantidadeEmEstoque);
    }
}
