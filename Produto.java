public class Produto {
    private int ID_Cadastro;
    private String Nome;
    private String Descricao;
    private double Valor_Custo;
    private double Valor_Venda;
    private String Estado;
    private int Quantidade;

    // Construtor da Classe
    public Produto(int id, String nome, String descricao, double custo, double venda, String estado) {
        this.ID_Cadastro = id;
        this.Nome = nome;
        this.Descricao = descricao;
        this.Valor_Custo = custo;
        this.Valor_Venda = venda;
        this.Estado = estado;
    }

    // Getters e Setters
    public void setId(int id) {
        this.ID_Cadastro = id;
    }

    public int getId() {
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

    public void setQuantidade(int quantidade){
        this.Quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.Quantidade;
    }
}
