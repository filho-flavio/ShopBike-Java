public class Main {
    public static void main(String[] args) {
        CadastroProdutos gerenciarProdutos = new CadastroProdutos();
        Estoque estoque = new Estoque();
        Caixa carrinho = new Caixa();
        CadastroCliente cadastroCliente = new CadastroCliente();

        gerenciarProdutos.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 29.", 998.99, 1990, "Novo");
        gerenciarProdutos.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 30.", 1000, 2499.90, "Novo");
        gerenciarProdutos.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 31.", 1199.99, 2899.90, "Novo");

        gerenciarProdutos.produtosCadastrados();

        Produto bicicletaAro29 = gerenciarProdutos.getProdutoPeloCodigo(0);
        Produto bicicletaAro30 = gerenciarProdutos.getProdutoPeloCodigo(1);
        Produto bicicletaAro31 = gerenciarProdutos.getProdutoPeloCodigo(2);

        estoque.adicionarProdutoAoEstoque(bicicletaAro29, 2);
        estoque.adicionarProdutoAoEstoque(bicicletaAro30, 2);
        estoque.adicionarProdutoAoEstoque(bicicletaAro31, 1);

        estoque.produtosEmEstoque();

        cadastroCliente.cadastrarCliente("Manoel Gomes ", "gomes@gmail.com");
        cadastroCliente.cadastrarCliente("João Cirilo", "cirilo9450@gmail.com");

        cadastroCliente.clientesCadastrados();

        Clientes ManoelGomes = cadastroCliente.getClientePeloCodigo(1);
        Clientes JoaoCirilo = cadastroCliente.getClientePeloCodigo(2);

        carrinho.adicionarAoCarrinho("Pedido para Manoel Gomes", ManoelGomes, bicicletaAro29, 4);
        carrinho.adicionarAoCarrinho("Pedido para Cirilo", JoaoCirilo, bicicletaAro30, 1);

        carrinho.mostrarCarrinho();

        carrinho.finalizarCompra(0, estoque);

        carrinho.desconto(1, 500);

        carrinho.removerPedidoCarrinho(0);

        carrinho.mostrarCarrinho();
    }
}
