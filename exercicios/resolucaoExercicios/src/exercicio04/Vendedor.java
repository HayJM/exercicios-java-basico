package exercicio04;

public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas (Vendedor): " + quantidadeVendas);
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Vendedor fez logoff.");
    }

    @Override
    public void alterarDados(String novoNome, String novoEmail) {
        setNome(novoNome);
        setEmail(novoEmail);
        System.out.println("Dados do vendedor alterados.");
    }
}
