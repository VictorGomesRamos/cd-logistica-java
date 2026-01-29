import model.Produto;
import service.EstoqueService;
import exception.EstoqueException;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Teclado", 10);
        EstoqueService estoqueService = new EstoqueService();

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Estoque inicial: " + produto1.getQuantidadeEmEstoque());

        try {
            estoqueService.entradaEstoque(produto1, 100);
            estoqueService.saidaEstoque(produto1, -3);
        } catch (EstoqueException e) {
            System.out.println("Erro no estoque: " + e.getMessage());
        }

        System.out.println("Estoque final: " + produto1.getQuantidadeEmEstoque());
    }
}
