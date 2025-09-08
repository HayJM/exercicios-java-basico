package exercicio04;

public class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado.");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas (Gerente).");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Gerente fez logoff.");
    }

    @Override
    public void alterarDados(String novoNome, String novoEmail) {
        setNome(novoNome);
        setEmail(novoEmail);
        System.out.println("Dados do gerente alterados.");
    }
}
