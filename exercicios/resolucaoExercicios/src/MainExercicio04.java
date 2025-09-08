import java.util.Scanner;

import exercicio04.BRLClock;
import exercicio04.Clock;
import exercicio04.USClock;

public class MainExercicio04 {
    public static void main(String[] args) {
        MainExercicio04 main = new MainExercicio04();
        System.out.println("Resolução do exercício 4");
        System.out.println("==Herança e Polimorfismo em Java ==");
        Scanner scanner = new Scanner(System.in);
        var ok = true;
        do{
            System.out.println("A- Cinema(tipos de ingresso) ");
            System.out.println("B- Loja(gerente, vendedor e atendente)");
            System.out.println("C- Criação de relógios para diferentes lugares do mundo");
            System.out.println("D- Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine().toUpperCase();
            switch (opcao) {
                case "A":
                    System.out.println("Sistema de Ingressos");
                    main.menuIngressos(scanner);
                    break;
                case "B":
                    System.out.println("Sistema de Usuários");
                    main.menuUsuarios(scanner);
                    break;
                case "C":
                    System.out.println("Criação de relógios para diferentes lugares do mundo");
                    main.criacaoDeRelogios();
                    break;
                case "D":
                    ok = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }while (ok);
        scanner.close();
    }
    void criacaoDeRelogios(){
        Clock brlclock = new BRLClock();
        brlclock.setSecond(0);
        brlclock.setMinute(0);
        brlclock.setHour(14);

        System.out.println("Hora BRL: " + brlclock.getTime()); 
        
        System.out.println("Hora US: " + new USClock().covert(brlclock).getTime());  
        
          
        
    }

    void menuIngressos(Scanner scanner) {
        System.out.println("\n--- Sistema de Ingressos ---");
        System.out.print("Nome do filme: ");
        String nomeFilme = scanner.nextLine();
        System.out.print("Valor base do ingresso: R$");
        double valor = Double.parseDouble(scanner.nextLine());
        System.out.print("O filme é dublado? (s/n): ");
        boolean dublado = scanner.nextLine().trim().equalsIgnoreCase("s");
        System.out.println("Tipo de ingresso:");
        System.out.println("1 - Inteira");
        System.out.println("2 - Meia Entrada");
        System.out.println("3 - Ingresso Família");
        System.out.print("Escolha: ");
        int tipo = Integer.parseInt(scanner.nextLine());
        exercicio04.Ingresso ingresso = null;
        switch (tipo) {
            case 1:
                ingresso = new exercicio04.Ingresso(valor, nomeFilme, dublado) {
                    @Override
                    public double valorReal() {
                        return valor;
                    }
                };
                break;
            case 2:
                ingresso = new exercicio04.MeiaEntrada(valor, nomeFilme, dublado);
                break;
            case 3:
                System.out.print("Número de pessoas: ");
                int pessoas = Integer.parseInt(scanner.nextLine());
                ingresso = new exercicio04.IngressoFamilia(valor, nomeFilme, dublado, pessoas);
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }
        System.out.println("\nResumo do ingresso:");
        System.out.println(ingresso);
        System.out.printf("Valor real a pagar: R$%.2f\n", ingresso.valorReal());
    }

    void menuUsuarios(Scanner scanner) {
        System.out.println("\n--- Sistema de Usuários ---");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Atendente");
        System.out.print("Escolha o tipo de usuário: ");
        int tipo = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        exercicio04.Usuario usuario = null;
        switch (tipo) {
            case 1:
                usuario = new exercicio04.Gerente(nome, email, senha);
                break;
            case 2:
                usuario = new exercicio04.Vendedor(nome, email, senha);
                break;
            case 3:
                usuario = new exercicio04.Atendente(nome, email, senha);
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }
        boolean menuUsuario = true;
        while (menuUsuario) {
            System.out.println("\n--- Menu do Usuário ---");
            System.out.println("1 - Realizar login");
            System.out.println("2 - Alterar dados");
            System.out.println("3 - Alterar senha");
            System.out.println("4 - Realizar logoff");
            if (usuario instanceof exercicio04.Gerente) {
                System.out.println("5 - Gerar relatório financeiro");
                System.out.println("6 - Consultar vendas");
            } else if (usuario instanceof exercicio04.Vendedor) {
                System.out.println("5 - Realizar venda");
                System.out.println("6 - Consultar vendas");
            } else if (usuario instanceof exercicio04.Atendente) {
                System.out.println("5 - Receber pagamento");
                System.out.println("6 - Fechar caixa");
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 1:
                    System.out.print("Digite a senha: ");
                    String s = scanner.nextLine();
                    if (usuario.realizarLogin(s)) {
                        System.out.println("Login realizado com sucesso!");
                    } else {
                        System.out.println("Senha incorreta!");
                    }
                    break;
                case 2:
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = scanner.nextLine();
                    usuario.alterarDados(novoNome, novoEmail);
                    break;
                case 3:
                    System.out.print("Nova senha: ");
                    String novaSenha = scanner.nextLine();
                    usuario.alterarSenha(novaSenha);
                    System.out.println("Senha alterada!");
                    break;
                case 4:
                    usuario.realizarLogoff();
                    break;
                case 5:
                    if (usuario instanceof exercicio04.Gerente) {
                        ((exercicio04.Gerente) usuario).gerarRelatorioFinanceiro();
                    } else if (usuario instanceof exercicio04.Vendedor) {
                        ((exercicio04.Vendedor) usuario).realizarVenda();
                    } else if (usuario instanceof exercicio04.Atendente) {
                        System.out.print("Valor a receber: R$");
                        double valor = Double.parseDouble(scanner.nextLine());
                        ((exercicio04.Atendente) usuario).receberPagamento(valor);
                    }
                    break;
                case 6:
                    if (usuario instanceof exercicio04.Gerente) {
                        ((exercicio04.Gerente) usuario).consultarVendas();
                    } else if (usuario instanceof exercicio04.Vendedor) {
                        ((exercicio04.Vendedor) usuario).consultarVendas();
                    } else if (usuario instanceof exercicio04.Atendente) {
                        ((exercicio04.Atendente) usuario).fecharCaixa();
                    }
                    break;
                case 0:
                    menuUsuario = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
