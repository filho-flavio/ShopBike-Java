public class Clientes {
    private int ID_Cliente;
    private String nome;
    private String contato;

    // Construtor padrão
    public Clientes(int cliente, String nome, String contato) {
        this.ID_Cliente = cliente;
        this.nome = nome;
        this.contato = contato;
    }

    // Métodos
    public void mostrarDadosCliente() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Contato: " + this.getContato());
    }

    // Getters and Setters
    public int getId() {
        return this.ID_Cliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getContato() {
        return this.contato;
    }
}
