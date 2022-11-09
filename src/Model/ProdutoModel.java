package Model;

public class ProdutoModel {

    String nome;
    double preco;
    int porDesconto;

    int estoqueReal;


    public ProdutoModel(String nome, double preco, int porDesconto, int estoqueReal){
        this.nome = nome;
        this.preco = preco;
        this.porDesconto = porDesconto;
        this.estoqueReal=estoqueReal;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPorDesconto() {
        return porDesconto;
    }

    public void setPorDesconto(int porDesconto) {
        this.porDesconto = porDesconto;
    }

    public int getEstoqueReal() {
        return estoqueReal;
    }

    public void setEstoqueReal(int estoqueReal) {
        this.estoqueReal = estoqueReal;
    }

    @Override
    public String toString() {
        return "ProdutoModel{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", porDesconto=" + porDesconto +
                ", estoqueReal=" + estoqueReal +
                '}';
    }
}
