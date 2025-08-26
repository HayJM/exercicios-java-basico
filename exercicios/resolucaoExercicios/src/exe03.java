// # Exercícios

// ## todos os execicios devem ter um menu de interativo para chamar as funções e ter uma opção de sair para finalizar a execução

// 1. Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
//     - Consultar saldo
//     - consultar cheque especial
//     - Depositar dinheiro;
//     - Sacar dinheiro;
//     - Pagar um boleto.
//     - Verificar se a conta está usando cheque especial.

// Siga as seguintes regras para implementar
//    - A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
//    - O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
//    - Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
//    - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
//    - Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

// --------

// 2. Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
//    - Ligar o carro;
//    - Desligar o carro;
//    - Acelerar;
//    - diminuir velocidade;
//    - virar para esquerda/direita
//    - verificar velocidade;
//    - trocar a marcha

// Siga as seguintes regras na implementação
//   - Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
//   - O carro desligado não pode realizar nenhuma função;
//   - Quando o carro for acelerado ele deve incrementar 5km em sua velocidade (pode chegar no máximo a 120km) e respeitar o limite de velocidade da marcha em que está;
//   - Quando diminuir a velocidade do carro ele deve decrementar 5 km de sua velocidade (pode chegar no minimo a 0km)e respeitar o limite de velocidade da marcha em que está;
//   - o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro e nem aumentar a velocidade se a marcha não permitir;
//   - A velocidade do carro deve respeitar os seguintes limites para cada velocidade
//      - se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
//      - se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
//      - se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
//      - se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
//      - se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
//      - se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
//      - se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
//    - O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
//    - O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;
//    - Só pode sair do carro se ele estiver parado (0km) e em ponto morto (marcha 0);

// -------------

// 3. Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
//    - Dar banho no pet;
//    - Abastecer com água;
//    - Abastecer com shampoo;
//    - verificar nivel de água;
//    - verificar nivel de shampoo;
//    - verificar se tem pet no banho;
//    - colocar pet na maquina;
//    - retirar pet da máquina;
//    - limpar maquina.

// Siga as seguintes regras para implementação

//    - A maquina de banho deve permitir somente 1 pet por vez;
//    - Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
//    - A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
//    - Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina 
// para permitir a entrada de outro pet;
//    - A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
//    - O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;

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
