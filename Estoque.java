import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtosEmEstoque;

    // Construtor
    public Estoque() {
        produtosEmEstoque = new ArrayList<>();
    }

    // Método para adicionar produtos em estoque
    public void adicionarProdutoAoEstoque(Produto produto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            produto.setQuantidade(quantidade);
            produtosEmEstoque.add(produto);
        }
    }

    // Método que retorna produtos em estoque
    public void produtosEmEstoque() {
        System.out.println("\n----------------------------------\n");
        System.out.println("Lista de Produtos em estoque: ");
        System.out.println("\n----------------------------------");
        for (Produto produto : produtosEmEstoque) {
            System.out.println("ID: " + produto.getId());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Valor venda: " + produto.getValorVenda());
            System.out.println("Estado produto: " + produto.getEstado());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("----------------------------------");
        }
    }

    // public boolean temNoEstoque(Produto produto, int quantidade) {
    //     if (produto.getQuantidade() >= quantidade) {
    //         return true;
    //     }
    //     return false;
    // }
}
