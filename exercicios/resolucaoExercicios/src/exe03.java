public class exe03 {
    void exec01(){
        var saldo = 0.0;
        var chequeEspecial = 0.0;
        var limiteChequeEspecialUsado = 0.0;
        var scanner = new java.util.Scanner(System.in);
        var contaCriada = false;
        boolean ok = true;
        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Por favor, faça um depósito inicial para criar sua conta.");
        System.out.print("Valor do depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();
        if (depositoInicial <= 500) {
            chequeEspecial = 50;
        } else {
            chequeEspecial = depositoInicial * 0.5;
        }
        saldo += depositoInicial;
        contaCriada = true;
        System.out.println("Conta criada com sucesso!");
        do {
            System.out.println("Menu:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar uso do cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            switch (opcao){
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.printf("Cheque especial disponível: R$ %.2f%n", chequeEspecial - limiteChequeEspecialUsado);
                    break;
                case 3:
                    System.out.print("Digite o valor a depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    if (!contaCriada) {
                        if (valorDeposito <= 500) {
                            chequeEspecial = 50;
                        } else {
                            chequeEspecial = valorDeposito * 0.5;
                        }
                        contaCriada = true;
                    }
                    saldo += valorDeposito;
                    System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valorDeposito);
                    break;
                case 4:
                    System.out.print("Digite o valor a sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo + (chequeEspecial - limiteChequeEspecialUsado)) {
                        if (valorSaque > saldo) {
                            double usoCheque = valorSaque - saldo;
                            limiteChequeEspecialUsado += usoCheque + (usoCheque * 0.2);
                            saldo = 0;
                        } else {
                            saldo -= valorSaque;
                        }
                        System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valorSaque);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto a pagar: R$ ");
                    double valorBoleto = scanner.nextDouble();
                    if (valorBoleto <= saldo + (chequeEspecial - limiteChequeEspecialUsado)) {
                        if (valorBoleto > saldo) {
                            double usoCheque = valorBoleto - saldo;
                            limiteChequeEspecialUsado += usoCheque + (usoCheque * 0.2);
                            saldo = 0;
                        } else {
                            saldo -= valorBoleto;
                        }
                        System.out.printf("Boleto de R$ %.2f pago com sucesso.%n", valorBoleto);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 6:
                    if (limiteChequeEspecialUsado > 0) {
                        System.out.printf("Você está usando R$ %.2f do cheque especial.%n", limiteChequeEspecialUsado);
                    } else {
                        System.out.println("Você não está usando o cheque especial.");  
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    ok = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");     
                }      
    
        } while (ok);
        scanner.close();
    }

    void exec02(){
        System.out.println("Bem Vindo ao Sitema de Controle de Carro");
        var scanner = new java.util.Scanner(System.in);
        boolean ligado = false;
        int marcha = 0;
        int velocidade = 0;
        boolean ok = true;
        do {
            System.out.println("Menu:");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Trocar marcha");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuir velocidade");
            System.out.println("5. Virar para esquerda");
            System.out.println("6. Virar para direita");
            System.out.println("7. Verificar velocidade");  
            System.out.println("8. Desligar o carro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    if (!ligado) {
                        ligado = true;
                        System.out.println("Carro ligado com sucesso!");
                    } else {
                        System.out.println("O carro já está ligado.");
                    }
                    break;
                case 2:
                    if (ligado) {
                        System.out.print("Digite a marcha desejada (0 a 6): ");
                        int novaMarcha = scanner.nextInt();
                        if (novaMarcha >= 0 && novaMarcha <= 6) {
                            if (Math.abs(novaMarcha - marcha) == 1 || (marcha == 0 && novaMarcha == 1) || (marcha == 1 && novaMarcha == 0)) {
                                // Verificar se a velocidade está compatível com a nova marcha
                                boolean velocidadeValida = false;
                                switch (novaMarcha) {
                                    case 0:
                                        if (velocidade == 0) velocidadeValida = true;
                                        break;
                                    case 1:
                                        if (velocidade >= 0 && velocidade <= 20) velocidadeValida = true;
                                        break;
                                    case 2:
                                        if (velocidade >= 20 && velocidade <= 40) velocidadeValida = true;
                                        break;
                                    case 3:
                                        if (velocidade >= 40 && velocidade <= 60) velocidadeValida = true;
                                        break;
                                    case 4:
                                        if (velocidade >= 60 && velocidade <= 80) velocidadeValida = true;
                                        break;
                                    case 5:
                                        if (velocidade >= 80 && velocidade <= 100) velocidadeValida = true;
                                        break;
                                    case 6:
                                        if (velocidade >= 100 && velocidade <= 120) velocidadeValida = true;
                                        break;
                                }
                                if (velocidadeValida) {
                                    marcha = novaMarcha;
                                    System.out.println("Marcha trocada para: " + marcha);
                                } else {
                                    System.out.println("Velocidade incompatível com a marcha selecionada.");
                                }
                            } else {
                                System.out.println("Não é permitido pular marchas.");
                            }
                        } else {
                            System.out.println("Marcha inválida. Escolha entre 0 e 6.");
                        }
                    } else {
                        System.out.println("O carro está desligado. Ligue o carro primeiro.");
                    }
                    break;
                case 3:
                    if (ligado) {
                        if (marcha == 0) {
                            System.out.println("O carro está em ponto morto. Não pode acelerar.");
                        } else {
                            if (velocidade < 120) {
                                velocidade += 5;
                                // Verificar se a velocidade está compatível com a marcha
                                boolean velocidadeValida = false;
                                switch (marcha) {
                                    case 1:
                                        if (velocidade >= 0 && velocidade <= 20) velocidadeValida = true;
                                        break;
                                    case 2:
                                        if (velocidade >= 20 && velocidade <= 40) velocidadeValida = true;
                                        break;
                                    case 3:
                                        if (velocidade >= 40 && velocidade <= 60) velocidadeValida = true;
                                        break;
                                    case 4:
                                        if (velocidade >= 60 && velocidade <= 80) velocidadeValida = true;
                                        break;
                                    case 5:
                                        if (velocidade >= 80 && velocidade <= 100) velocidadeValida = true;
                                        break;
                                    case 6:
                                        if (velocidade >= 100 && velocidade <= 120) velocidadeValida = true;
                                        break;
                                }
                                if (velocidadeValida) {
                                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                                } else {
                                    velocidade -= 5; // Reverter o aumento de velocidade
                                    System.out.println("Velocidade incompatível com a marcha atual.");
                                }
                            } else {
                                System.out.println("Velocidade máxima atingida (120 km/h).");
                            }
                        }
                    } else {
                        System.out.println("O carro está desligado. Ligue o carro primeiro.");
                    }
                    break;
                    
                case 4:
                    if (ligado) {
                        if (velocidade > 0) {
                            velocidade -= 5;
                            if (velocidade < 0) velocidade = 0; // Garantir que a velocidade não fique negativa
                            // Verificar se a velocidade está compatível com a marcha
                            boolean velocidadeValida = false;
                            switch (marcha) {
                                case 0:
                                    if (velocidade == 0) velocidadeValida = true;
                                    break;
                                case 1:
                                    if (velocidade >= 0 && velocidade <= 20) velocidadeValida = true;
                                    break;
                                case 2:
                                    if (velocidade >= 20 && velocidade <= 40) velocidadeValida = true;
                                    break;
                                case 3:
                                    if (velocidade >= 40 && velocidade <= 60) velocidadeValida = true;
                                    break;
                                case 4:
                                    if (velocidade >= 60 && velocidade <= 80) velocidadeValida = true;
                                    break;
                                case 5:
                                    if (velocidade >= 80 && velocidade <= 100) velocidadeValida = true;
                                    break;
                                case 6:
                                    if (velocidade >= 100 && velocidade <= 120) velocidadeValida = true;
                                    break;
                            }
                            if (velocidadeValida) {
                                System.out.println("Velocidade atual: " + velocidade + " km/h");
                            } else {
                                System.out.println("Velocidade incompatível com a marcha atual.");
                            }
                        } else {
                            System.out.println("O carro já está parado.");
                        }
                    } else {
                        System.out.println("O carro está desligado. Ligue o carro primeiro.");
                    }
                    break;
                case 5:
                    if (ligado) {
                        if (velocidade >= 1 && velocidade <= 40) {
                            System.out.println("Virando para a esquerda.");
                        } else {
                            System.out.println("Velocidade incompatível para virar. Deve estar entre 1 km/h e 40 km/h.");
                        }
                    } else {
                        System.out.println("O carro está desligado. Ligue o carro primeiro.");
                    }
                    break;
                case 6:
                    if (ligado) {
                        if (velocidade >= 1 && velocidade <= 40) {
                            System.out.println("Virando para a direita.");
                        } else {
                            System.out.println("Velocidade incompatível para virar. Deve estar entre 1 km/h e 40 km/h.");
                        }
                    } else {
                        System.out.println("O carro está desligado. Ligue o carro primeiro.");
                    }
                    break;
                case 7:
                    if (ligado) {
                        System.out.println("Velocidade atual: " + velocidade + " km/h");
                    } else {
                        System.out.println("O carro está desligado. Ligue o carro primeiro.");
                    }
                    break;
                case 8:
                    if (ligado) {
                        if (marcha == 0 && velocidade == 0) {
                            ligado = false;
                            System.out.println("Carro desligado com sucesso!");
                        } else {
                            System.out.println("Para desligar o carro, ele deve estar em ponto morto (marcha 0) e parado (0 km/h).");
                        }
                    } else {
                        System.out.println("O carro já está desligado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    ok = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                }
        } while (ok);
        scanner.close();               
            
    }
    
    void exec03(){
        System.out.println("Bem Vindo ao Sitema de Controle de Banho de Petshop");
        var scanner = new java.util.Scanner(System.in);
        int nivelAgua = 30;
        int nivelShampoo = 10;
        boolean petNoBanho = false;
        boolean maquinaLimpa = true;
        boolean ok = true;
        do {
            System.out.println("Menu:");
            System.out.println("1. Colocar pet na máquina");
            System.out.println("2. Retirar pet da máquina");
            System.out.println("3. Dar banho no pet");
            System.out.println("4. Abastecer com água");
            System.out.println("5. Abastecer com shampoo");
            System.out.println("6. Verificar nível de água");
            System.out.println("7. Verificar nível de shampoo");
            System.out.println("8. Limpar máquina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    if (!petNoBanho) {
                        if (maquinaLimpa) {
                            petNoBanho = true;
                            System.out.println("Pet colocado na máquina com sucesso!");
                        } else {
                            System.out.println("A máquina está suja. Limpe a máquina antes de colocar outro pet.");
                        }
                    } else {
                        System.out.println("Já há um pet na máquina.");
                    }
                    break;
                case 2:
                    if (petNoBanho) {
                        petNoBanho = false;
                        maquinaLimpa = false; // A máquina fica suja se o pet for retirado sem banho
                        System.out.println("Pet retirado da máquina.");
                    } else {
                        System.out.println("Não há nenhum pet na máquina.");
                    }
                    break;
                case 3:
                    if (petNoBanho) {
                        if (nivelAgua >= 10 && nivelShampoo >= 2) {
                            nivelAgua -= 10;
                            nivelShampoo -= 2;
                            maquinaLimpa = true; // A máquina fica limpa após o banho
                            System.out.println("Banho dado no pet com sucesso!");
                        } else {
                            System.out.println("Nível insuficiente de água ou shampoo para dar banho.");
                        }
                    } else {
                        System.out.println("Não há nenhum pet na máquina.");
                    }
                    break;
                case 4:
                    if (nivelAgua <= 28) {
                        nivelAgua += 2;
                        System.out.println("Máquina abastecida com 2 litros de água.");
                    } else {
                        System.out.println("Nível máximo de água atingido (30 litros).");
                    }
                    break;
                case 5:
                    if (nivelShampoo <= 8) {
                        nivelShampoo += 2;
                        System.out.println("Máquina abastecida com 2 litros de shampoo.");
                    } else {
                        System.out.println("Nível máximo de shampoo atingido (10 litros).");
                    }
                    break;
                case 6:
                    System.out.println("Nível atual de água: " + nivelAgua + " litros");
                    break;
                case 7:
                    System.out.println("Nível atual de shampoo: " + nivelShampoo + " litros");
                    break;
                case 8:
                    if (!maquinaLimpa) {
                        if (nivelAgua >= 3 && nivelShampoo >= 1) {
                            nivelAgua -= 3;
                            nivelShampoo -= 1;
                            maquinaLimpa = true;
                            System.out.println("Máquina limpa com sucesso!");
                        } else {
                            System.out.println("Nível insuficiente de água ou shampoo para limpar a máquina.");
                        }
                    } else {
                        System.out.println("A máquina já está limpa.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    ok = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                }
        } while (ok);
        scanner.close();           
    }
    public static void main(String[] args){
        exe03 ex = new exe03();
        // switch case para chamar os métodos dos exercícios 1 a 3 e 4 para sair
        var scanner = new java.util.Scanner(System.in);
        int opcao;
        boolean ok = true;
        do {
            System.out.println("Menu de Exercícios:");
            System.out.println("1. Exercício 1 - Conta Bancária");
            System.out.println("2. Exercício 2 - Controle de Carro");
            System.out.println("3. Exercício 3 - Controle de Banho de Petshop");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();  
            switch (opcao) {
                case 1:
                    ex.exec01();
                    break;
                case 2:
                    ex.exec02();
                    break;
                case 3:
                    ex.exec03();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    ok = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (ok);
        scanner.close();
        
    }

}
