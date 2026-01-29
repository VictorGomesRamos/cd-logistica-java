package service;

import model.Produto;
import exception.EstoqueException;

public class EstoqueService {

    public void entradaEstoque(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new EstoqueException("Quantidade inválida para entrada");
        }
        produto.setQuantidadeEmEstoque(
                produto.getQuantidadeEmEstoque() + quantidade
        );
    }

    public void saidaEstoque(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new EstoqueException("Quantidade inválida para saída");
        }
        if (quantidade > produto.getQuantidadeEmEstoque()) {
            throw new EstoqueException("Estoque insuficiente");
        }
        produto.setQuantidadeEmEstoque(
                produto.getQuantidadeEmEstoque() - quantidade
        );
    }
}
