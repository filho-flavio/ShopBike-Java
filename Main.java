public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Estoque estoque = new Estoque();
        Pedido pedidos = new Pedido();
        CadastroCliente cadastroCliente = new CadastroCliente();

        cadastro.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 29.", 998.99, 1990, "Novo");
        cadastro.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 30.", 1000, 2499.90, "Novo");
        cadastro.cadastrarNovoProduto("Bicicleta", "Bicicleta Aro 31.", 1199.99, 2899.90, "Novo");

        cadastro.produtosCadastrados();

        Produto bicicletaAro29 = cadastro.getProdutoPeloCodigo(0);
        Produto bicicletaAro30 = cadastro.getProdutoPeloCodigo(1);
        Produto bicicletaAro31 = cadastro.getProdutoPeloCodigo(2);

        estoque.adicionarProdutoAoEstoque(bicicletaAro29, 2);
        estoque.adicionarProdutoAoEstoque(bicicletaAro30, 2);
        estoque.adicionarProdutoAoEstoque(bicicletaAro31, 1);

        estoque.produtosEmEstoque();

        cadastroCliente.cadastrarCliente("Manoel Gomes ", "gomes@gmail.com");

        cadastroCliente.clientesCadastrados();

        Clientes ManoelGomes = cadastroCliente.getClientePeloCodigo(1);

        pedidos.emitirPedido(ManoelGomes, bicicletaAro31, 1);

        pedidos.detalharPedido();

    }
}