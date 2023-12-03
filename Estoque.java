import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtosEmEstoque;

    public Estoque() {
        produtosEmEstoque = new ArrayList<>();
    }

    public void adicionarProdutoAoEstoque(Produto produto, int quantidade) {

        for (int i = 0; i < quantidade; i++) {
            produtosEmEstoque.add(produto);
        }
    }

    public void produtosEmEstoque(){
        System.out.println("----------------------------------\n");
        System.out.println("Lista de Produtos em estoque: ");
        System.out.println("\n----------------------------------");
        for(Produto produto : produtosEmEstoque){
            System.out.println("ID: " + produto.getId());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Valor venda: " + produto.getValorVenda());
            System.out.println("Estado produto: " + produto.getEstado());
            System.out.println("----------------------------------");
        }
    }
}
