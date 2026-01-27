import model.Estoque;
import model.Produto;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Teclado", 10));
        estoque.adicionarProduto(new Produto("Mouse", 20));

        estoque.entradaEstoque("Teclado", 5);
        estoque.saidaEstoque("Mouse", 30); // inválida
        estoque.saidaEstoque("Mouse", 5);  // válida

        estoque.listarProdutos();
    }
}
