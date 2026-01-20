package model;

public class Produto {

    private String nome;
    private int quantidadeEmEstoque;

    public Produto(String nome, int quantidadeInicial){
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }
    
    public void entradaEstoque(int quantidade){
        if (quantidade > 0){
            quantidadeEmEstoque += quantidade;
        }
    }

    public boolean saidaEstoque(int quantidade){
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque){
            quantidadeEmEstoque -= quantidade;
            return true;
        }
        return false;
    }
}
