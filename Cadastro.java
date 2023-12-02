public class Cadastro {
    private String ID_Cadastro;
    private String Nome;
    private String Descricao;
    private double Valor_Custo;
    private double Valor_Venda;
    private String Estado;

    // Construtor da Classe
    public Cadastro(String id, String nome, String descricao, double custo, double venda, String estado) {
        this.ID_Cadastro = id;
        this.Nome = nome;
        this.Descricao = descricao;
        this.Valor_Custo = custo;
        this.Valor_Venda = venda;
        this.Estado = estado;
    }

    // Getters e Setters
    public void setId(String id) {
        this.ID_Cadastro = id;
    }

    public String getId() {
        return this.ID_Cadastro;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public void setValorCusto(double valorCusto) {
        this.Valor_Custo = valorCusto;
    }

    public double getValorCusto() {
        return this.Valor_Custo;
    }

    public void setValorVenda(double valorVenda) {
        this.Valor_Venda = valorVenda;
    }

    public double getValorVenda() {
        return this.Valor_Venda;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

    public String getEstado() {
        return this.Estado;
    }
}
