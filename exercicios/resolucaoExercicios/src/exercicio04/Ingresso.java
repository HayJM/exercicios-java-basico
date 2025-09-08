package exercicio04;

public abstract class Ingresso {
    protected double valor;
    protected String nomeFilme;
    protected boolean dublado;

    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    public abstract double valorReal();

    @Override
    public String toString() {
        return "Filme: " + nomeFilme + ", Valor base: R$" + valor + ", " + (dublado ? "Dublado" : "Legendado");
    }
}
