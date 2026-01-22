import model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Teclado",10);

        System.out.println("Produto " + produto1.getNome());
        System.out.println("Estoque inicial: " + produto1.getQuantidadeEmEstoque());

        produto1.entradaEstoque(100);
        produto1.saidaEstoque(-3);

        System.out.println("Estoque final: " + produto1.getQuantidadeEmEstoque());
    }
}