package model;

public class Produto {

    private String nome;
    private int quantidadeEmEstoque;

    public Produto(String nome, int quantidadeInicial){
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeInicial;

        if(quantidadeInicial < 0){
            this.quantidadeEmEstoque = 0;
        } else{
            this.quantidadeEmEstoque = quantidadeInicial;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }
    
    public void entradaEstoque(int quantidade){
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para entrada");
            return;
        }
                quantidadeEmEstoque += quantidade;
            }


    public void saidaEstoque(int quantidade){
        if (quantidade <=0 ) {
            System.out.println("Quantidade inválida para a saída");
            return;
        }

        if (quantidade > quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente");
            return;
        }
            quantidadeEmEstoque -= quantidade;

    }
}
