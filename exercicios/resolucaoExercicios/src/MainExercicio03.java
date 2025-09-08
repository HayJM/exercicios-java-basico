import java.util.Scanner;

import exercicio03.ContaBancaria;
import exercicio03.SistemaDoCarro;
import exercicio03.MaquinaDeBanho;

public class MainExercicio03 {
    public static void main(String[] args) {
        MainExercicio03 main = new MainExercicio03();
        System.out.println("Resolução do exercício 3");
        System.out.println("==Java e a Arte de Abstração com Classes e Encapsulamento==");
        Scanner scanner = new Scanner(System.in);
        var ok = true;
        do{
            System.out.println("A- Conta Bancária");
            System.out.println("B- Sitema de Controle de Carro");
            System.out.println("C- Sistema de Controle de Banho de PetShop");
            System.out.println("D- Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine().toUpperCase();
            switch (opcao) {
                case "A":
                    System.out.println("É necessário um depósito inicial para criar a conta.");
                    System.out.print("Digite o valor do depósito inicial: R$");
                    double depositoInicial = scanner.nextDouble();
                    main.menuInterativoContaBancaria(depositoInicial);
                    break;
                case "B":
                    System.out.println("Exercício de Sistema de Controle de Carro");
                    main.menuInterativoSistemaDoCarro();
                    break;
                case "C":
                    System.out.println("Exercício de Sistema de Controle de Banho de PetShop");
                    main.menuInterativoMaquinaDeBanho();
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
    void menuInterativoMaquinaDeBanho() {
        var ok = true;
        MaquinaDeBanho maquina = new MaquinaDeBanho();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("=== Menu da Máquina de Banho de PetShop ===");
            System.out.println("1. Colocar pet na máquina");
            System.out.println("2. Retirar pet da máquina");
            System.out.println("3. Dar banho no pet");
            System.out.println("4. Abastecer água");
            System.out.println("5. Abastecer shampoo");
            System.out.println("6. Verificar nível de água");
            System.out.println("7. Verificar nível de shampoo");
            System.out.println("8. Verificar se tem pet na máquina");
            System.out.println("9. Limpar máquina");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    maquina.colocarPet();
                    break;
                case 2:
                    maquina.retirarPet();
                    break;
                case 3:
                    maquina.darBanho();
                    break;
                case 4:
                    maquina.abastecerAgua();
                    break;
                case 5:
                    maquina.abastecerShampoo();
                    break;
                case 6:
                    maquina.verificarNivelAgua();
                    break;
                case 7:
                    maquina.verificarNivelShampoo();
                    break;
                case 8:
                    maquina.verificarPetNoBanho();
                    break;
                case 9:
                    maquina.limparMaquina();
                    break;
                case 10:
                    ok = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (ok);
        scanner.close();
    }

    void menuInterativoContaBancaria(double depositoInicial){
        var ok = true;
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setCriarContaBancaria(depositoInicial);
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("=== Menu da Conta Bancária ===");
            System.out.println("1. Verificar Saldo");
            System.out.println("2. Depositar Dinheiro");
            System.out.println("3. Sacar Dinheiro");
            System.out.println("4. Verificar Limite do Cheque Especial");
            System.out.println("5. Verificar Limite do Cheque Especial Usado");
            System.out.println("6. Pagar Boleto");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + contaBancaria.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: R$");
                    double valorDeposito = scanner.nextDouble();
                    contaBancaria.setDepoitarDinheiro(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: R$");
                    double valorSaque = scanner.nextDouble();
                    contaBancaria.setSacarDinheiro(valorSaque);
                    break;
                case 4:
                    System.out.println("Limite do cheque especial: R$" + contaBancaria.getVerificarChequeEspecial());
                    break;
                case 5:
                    System.out.println("Limite do cheque especial usado: R$" + contaBancaria.getVerificarLimiteChequeEspecialUsado());
                    break;
                case 6:
                    System.out.print("Digite o valor do boleto a ser pago: R$");
                    double valorBoleto = scanner.nextDouble();
                    contaBancaria.setPagarBoleto(valorBoleto);
                    break;
                case 7:
                    ok = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
           

        }while (ok);
        scanner.close();

    }

    void menuInterativoSistemaDoCarro(){
        var ok = true;
        SistemaDoCarro sistemaDoCarro = new SistemaDoCarro();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("=== Menu do Sistema de Controle de Carro ===");
            System.out.println("1. Ligar Carro");
            System.out.println("2. Trocar Marcha");
            System.out.println("3. Acelerar Carro");
            System.out.println("4. Virar Carro");
            System.out.println("5. Diminuir Velocidade do Carro");
            System.out.println("6. Desligar Carro");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    sistemaDoCarro.ligarCarro();
                    break;
                case 2:
                    System.out.print("Digite a marcha para a qual deseja trocar (U = up, D= down): ");
                    String novaMarcha = scanner.next().toUpperCase();
                    sistemaDoCarro.mudarMarchaCarro(novaMarcha.charAt(0));
                    break;
                case 3:
                    sistemaDoCarro.acelerarCarro();
                    break;
                case 4:
                    System.out.print("Digite a direção para a qual deseja virar (E = esquerda, D = direita): ");
                    String direcao = scanner.next().toLowerCase();
                    sistemaDoCarro.virarCarro(direcao.charAt(0));;
                    break;
                case 5:
                    sistemaDoCarro.diminuirVelocidadeCarro();
                    break;
                case 6:
                    sistemaDoCarro.desligarCarro();
                    break;
                case 7:
                    ok = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
           

        }while (ok);
        scanner.close();

    }
}
