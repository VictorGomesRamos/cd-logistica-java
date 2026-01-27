package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void entradaEstoque(String nome, int quantidade) {
        Produto produto = buscarProduto(nome);
        produto.entradaEstoque(quantidade);
    }

    public void saidaEstoque(String nome, int quantidade) {
        Produto produto = buscarProduto(nome);
        produto.saidaEstoque(quantidade);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        for (Produto produto : produtos) {
            produto.exibirProduto();
        }
    }

    private Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        throw new RuntimeException("Produto não encontrado.");
    }
}
