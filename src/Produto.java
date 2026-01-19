public class Produto {

    String nome;
    int quantidadeemEstoque;

    void entradaEstoque(int quantidade){
        quantidadeemEstoque += quantidade;
    }

    void saidaestoque(int quantidade){
        if( quantidade <= quantidadeemEstoque){
            quantidadeemEstoque -= quantidade;
        } else{
            System.out.println("Estoque insuficiente para saída");
        }
    }

    void exibirProduto(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantidadeemEstoque);
        System.out.println("---------------------");
    }
}
