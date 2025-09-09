package exercicio05;

public class SaudeBemEstar implements Product {
    private String nome;
    private double preco;

    public SaudeBemEstar(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.015;
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
