import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Produto> produtosCadastrados;
    private int id = 0;

    public Cadastro() {
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
        return null;
    }
}
