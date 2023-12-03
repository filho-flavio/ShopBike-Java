public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Estoque estoque = new Estoque();

        cadastro.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 29.", 998.99, 1990, "Nova");
        cadastro.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 30.", 1000, 2499.90, "Nova");
        cadastro.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 31.", 1199.99, 2899.90, "Nova");

        Produto bicicletaAro29 = cadastro.getProdutoPeloCodigo(0);
        Produto bicicletaAro30 = cadastro.getProdutoPeloCodigo(1);
        Produto bicicletaAro31 = cadastro.getProdutoPeloCodigo(2);

        estoque.adicionarProdutoAoEstoque(bicicletaAro29, 2);
        estoque.adicionarProdutoAoEstoque(bicicletaAro30, 2);
        estoque.adicionarProdutoAoEstoque(bicicletaAro31, 2);

        estoque.produtosEmEstoque();
    }
}