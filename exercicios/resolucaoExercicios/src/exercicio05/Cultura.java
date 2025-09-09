package exercicio05;

public class Cultura implements Product {
    private String nome;
    private double preco;

    public Cultura(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.04;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
