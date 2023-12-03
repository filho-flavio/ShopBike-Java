public class Pedido {
    private int ID_Pedido = 1;
    Clientes cliente;
    Produto produto;
    Estoque estoque;

    // Construtor
    public Pedido() {
        this.estoque = estoque;
    }

    // Métodos
    public void emitirPedido(Clientes cliente, Produto produto, int quantidade) {
        this.ID_Pedido++;
        this.cliente = cliente;
        this.produto = produto;
        this.produto.setQuantidade(quantidade);
        if (estoque.temNoEstoque(produto, quantidade)) {
            System.out.println("O pedido foi realizado com sucesso!");
        } else {
            System.out.println("Não há suficiente estoque para o produto solicitado.");
        }
    }

    public void detalharPedido() {
        System.out.println("\n----------------------------------\n");
        System.out.println("Detalhes do pedido");
        System.out.println("\n----------------------------------");
        System.out.print("ID do pedido: " + ID_Pedido);
        System.out.println("\n----------------------------------\n");
        System.out.println("Dados do Cliente:");
        System.out.println("\n----------------------------------");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Contato: " + cliente.getContato());
        System.out.println("\n----------------------------------");
        System.out.println("Produtos: ");
        System.out.println("\n----------------------------------");
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Estado: " + produto.getEstado());
        System.out.println("Valor: " + produto.getValorVenda());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }

    // Getters and Setters
    public int getId() {
        return this.ID_Pedido;
    }
}
