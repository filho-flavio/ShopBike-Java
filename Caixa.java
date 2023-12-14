import java.util.ArrayList;

public class Caixa {
    ArrayList<Pedido> pedidosEmCarrinho;
    private int id = 0;

    public Caixa() {
        pedidosEmCarrinho = new ArrayList<>();
    }

    public void adicionarAoCarrinho(String nomePedido, Clientes cliente, Produto produto, int quantidade) {
        Pedido novoPedido = new Pedido(id++, nomePedido, cliente, produto, quantidade);
        this.pedidosEmCarrinho.add(novoPedido);
    }

    public void mostrarCarrinho() {
        System.out.println("\n==================================\n");
        System.out.println("Itens no carrinho: ");
        System.out.println("\n==================================\n");
        for (Pedido pedido : pedidosEmCarrinho) {
            pedido.detalharPedido();
        }
    }

    public void removerPedidoCarrinho(int idPedido){
        for(Pedido pedido : pedidosEmCarrinho){
            if(idPedido == pedido.getId()) {
                pedidosEmCarrinho.remove(idPedido); 
            }
         }
    };

    public void finalizarCompra(int codigo, Estoque estoque){
         for(Pedido pedido : pedidosEmCarrinho){
            if(codigo == pedido.getId() && estoque.temNoEstoque(pedido.getProduto())) {
                System.out.println("\n----------------------------------\n");
                System.out.println("Obrigado por comprar conosco!");
                pedidosEmCarrinho.remove(codigo);
            }
         }
    }

    public void desconto(int idPedido, double descontoPedido){
        for(Pedido pedido : pedidosEmCarrinho){
            if(idPedido == pedido.getId()){
                double novoValor = pedido.getValorPedido() - descontoPedido;
                pedido.setValorProduto(novoValor);
           }
        }
    }


}
