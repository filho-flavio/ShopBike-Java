import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtosCadastrados;
    private int id = 0;

    public CadastroProdutos() {
        produtosCadastrados = new ArrayList<>();
    }

    public void cadastrarNovoProduto(String nome, String descricao, double custo, double venda,
            String estado) {
        Produto novoProduto = new Produto(id++, nome, descricao, custo, venda, estado);
        produtosCadastrados.add(novoProduto);
    }

    public Produto getProdutoPeloCodigo(int codigo) {
        for (Produto produto : produtosCadastrados) {
            if (produto.getId() == codigo) {
                return produto;
            }
        }
        throw new Error("Produto não encontrado!");
    }

    public void produtosCadastrados(){
        System.out.println("----------------------------------\n");
        System.out.println("Lista de Produtos cadastrados: ");
        System.out.println("\n----------------------------------");
        for(Produto produto : produtosCadastrados){
            System.out.println("ID: " + produto.getId());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Valor custo: " + produto.getValorCusto());
            System.out.println("Valor venda: " + produto.getValorVenda());
            System.out.println("Estado produto: " + produto.getEstado());
            System.out.println("----------------------------------");
        };
    }
}
