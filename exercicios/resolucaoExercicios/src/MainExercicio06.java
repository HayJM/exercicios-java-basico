import java.util.Arrays;
import java.util.Scanner;
import exercicio06.*;

public class MainExercicio06 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MainExercicio06 main = new MainExercicio06();
        var ok = true;
        System.out.println("Resolução do exercício 6");
        System.out.println("==Praticando com Collections e Outras Classes Úteis do Java ==");
        
        do{
            System.out.println("A- calculadora para as operações de soma e subtração");
            System.out.println("B- Fomatação Telefone e Celular");
            System.out.println("C- Conversor Json");
            System.out.println("D- Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine().toUpperCase();
            switch (opcao) {
                case "A":
                    System.out.println("A- calculadora para as operações de soma e subtração");
                    main.calculadoraMatematica();
                    break;
                case "B":
                    System.out.println("B- Fomatação Telefone e Celular");
                    main.calculoDeTributos();
                    break;
                case "C":
                    System.out.println("C- Conversor Json");
                    main.calculoAreaFiguraGeometrica();
                    break;
                case "D":
                    ok = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }


        }while(ok);
        scanner.close();
        
    }

    void calculadoraMatematica(){
        System.out.println("Escolha a operação que deseja realizar:");
        System.out.print("Imforme o numero da operação que deseja realizar (1 = SUM , 2 = SUBTRACTION): ");
        
        var operationOption = scanner.nextInt();
        while(operationOption > 2 || operationOption < 1){
            System.out.print("Opção inválida. Informe novamente (1 = SUM , 2 = SUBTRACTION): ");
            operationOption = scanner.nextInt();
        }
        var selectedOperation = Operation.values()[operationOption - 1]; 
        System.out.print("Informe os números que seram usados separados por virgual: ex: 1,2,3,4: ");
        var numbersInput = scanner.next();
        var numbersArray = Arrays.stream(numbersInput.split(","))
                                    .mapToLong(s-> Long.parseLong(s))
                                    .toArray();
        var result = selectedOperation.getOperationCallBack().execute(numbersArray);
        var operationToShow = numbersInput.replaceAll(",",selectedOperation.getSignal());

        System.out.println(operationToShow + "  O resultado da operação "+ selectedOperation.name() + " é: " + result);



        scanner.nextLine(); // Limpar o buffer do scanner
    }

    void calculoDeTributos(){}

    void calculoAreaFiguraGeometrica(){ }
    
    
    }
