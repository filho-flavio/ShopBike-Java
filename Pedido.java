public class Pedido {
    private int ID_Pedido;
    private String nomePedido;
    private boolean statusPedido;
    private Clientes cliente;
    private Produto produto;

    // Construtor
    public Pedido(int ID_Pedido, String nomePedido, Clientes cliente, Produto produto, int quantidade) {
        this.ID_Pedido = ID_Pedido;
        this.nomePedido = nomePedido;
        this.cliente = cliente;
        this.produto = produto;
        this.produto.setQuantidade(quantidade);
        // if (estoque.temNoEstoque(produto, quantidade)) {
        // System.out.println("O pedido foi realizado com sucesso!");
        // } else {
        // System.out.println("Não há suficiente estoque para o produto solicitado.");
        // }
    }

    public void detalharPedido() {
        System.out.println("\n----------------------------------");
        System.out.println("Detalhes do Pedido: " + nomePedido);
        System.out.println("ID do Pedido: " + getId());
        System.out.println("----------------------------------\n");

        System.out.println("Dados do Cliente:");
        System.out.println("----------------------------------");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Contato: " + cliente.getContato());
        System.out.println("\n----------------------------------");

        System.out.println("Produtos:");
        System.out.println("----------------------------------");
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Estado: " + produto.getEstado());
        System.out.println("Valor: " + produto.getValorVenda());
        System.out.println("Quantidade: " + produto.getQuantidade());

        System.out.println("\n----------------------------------\n");
    }

    // Getters and Setters
    public int getId() {
        return this.ID_Pedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public String getNomePedido() {
        return this.nomePedido;
    }

    public void setStatus(boolean status) {
        this.statusPedido = status;
    }

    public boolean getStatusPedido() {
        return this.statusPedido;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Clientes getCliente() {
        return this.cliente;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setValorProduto(double valor) {
        this.produto.setValorVenda(valor);
    }

    public double getValorPedido(){
        return this.produto.getValorVenda();
    }
}
