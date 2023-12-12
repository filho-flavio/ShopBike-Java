public class Servico {
    private int ID_Cadastro;
    private String Nome;
    private String Descricao;
    private double Valor_Custo;

    // Construtor da Classe
    public Servico(int id, String nome, String descricao, double custo) {
        this.ID_Cadastro = id;
        this.Nome = nome;
        this.Descricao = descricao;
        this.Valor_Custo = custo;
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
}
