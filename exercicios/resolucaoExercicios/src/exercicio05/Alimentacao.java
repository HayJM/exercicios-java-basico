package exercicio05;

public class Alimentacao implements Product {
    private String nome;
    private double preco;

    public Alimentacao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.01;
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
