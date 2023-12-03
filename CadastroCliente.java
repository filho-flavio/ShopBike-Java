import java.util.ArrayList;

public class CadastroCliente {
    ArrayList<Clientes> clientes;
    private int id = 1;

    public CadastroCliente() {
        clientes = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String contato) {
        Clientes novoCliente = new Clientes(id++, nome, contato);
        this.clientes.add(novoCliente);
    }

    public void clientesCadastrados() {
        System.out.println("\n----------------------------------\n");
        System.out.println("Lista de Clientes cadastrados: ");
        System.out.println("\n----------------------------------");
        for (Clientes cliente : clientes) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Contato: " + cliente.getContato());
            System.out.println("\n----------------------------------");
        }
    }

    public Clientes getClientePeloCodigo(int codigo) {
        for (Clientes cliente : clientes) {
            if (codigo == cliente.getId()){
                return cliente;
            }
        }
        throw new Error("Cliente não encontrado!");
    }
}
