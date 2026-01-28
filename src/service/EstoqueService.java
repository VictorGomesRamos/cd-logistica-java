package service;

import model.Estoque;
import model.Produto;

public class EstoqueService {

    private Estoque estoque = new Estoque();

    public void cadastrarProduto(String nome, int quantidade) {
        Produto produto = new Produto(nome, quantidade);
        estoque.adicionarProduto(produto);
    }

    public void entradaEstoque(String nome, int quantidade) {
        estoque.entradaEstoque(nome, quantidade);
    }

    public void saidaEstoque(String nome, int quantidade) {
        estoque.saidaEstoque(nome, quantidade);
    }

    public void listarProdutos() {
        estoque.listarProdutos();
    }
}

