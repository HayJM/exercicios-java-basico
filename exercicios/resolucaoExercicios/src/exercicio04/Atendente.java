package exercicio04;

public class Atendente extends Usuario {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorCaixa = 0.0;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void receberPagamento(double valor) {
        valorCaixa += valor;
        System.out.println("Pagamento recebido. Valor em caixa: R$" + valorCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor final: R$" + valorCaixa);
        valorCaixa = 0.0;
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Atendente fez logoff.");
    }

    @Override
    public void alterarDados(String novoNome, String novoEmail) {
        setNome(novoNome);
        setEmail(novoEmail);
        System.out.println("Dados do atendente alterados.");
    }
}
