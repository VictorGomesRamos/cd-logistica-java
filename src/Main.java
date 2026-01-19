//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Teclado";
        produto1.quantidadeemEstoque = 10;

        produto1.exibirProduto();

        produto1.entradaEstoque(5);
        produto1.saidaestoque(3);

        produto1.exibirProduto();

        System.out.println(produto1.nome);
    }
}