package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void entradaEstoque(String nomeProduto, int quantidade) {
        Produto produto = buscarProdutoPorNome(nomeProduto);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        produto.entradaEstoque(quantidade);
    }

    public void saidaEstoque(String nomeProduto, int quantidade) {
        Produto produto = buscarProdutoPorNome(nomeProduto);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        produto.saidaEstoque(quantidade);
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            p.exibirProduto();
            System.out.println("---------------");
        }
    }
}

