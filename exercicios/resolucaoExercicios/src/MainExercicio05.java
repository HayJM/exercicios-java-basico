import java.util.Scanner;
import exercicio05.*;

public class MainExercicio05 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MainExercicio05 main = new MainExercicio05();
        var ok = true;
        System.out.println("Resolução do exercício 5");
        System.out.println("==Dominando Interfaces e Lambda em Java==");
        
        do{
            System.out.println("A- Mensagens de marketing");
            System.out.println("B- Calculr o valor de tributos dos produtos");
            System.out.println("C- Calcular a área de uma figura geométrica");
            System.out.println("D- Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine().toUpperCase();
            switch (opcao) {
                case "A":
                    System.out.println("A- Mensagens de marketing");
                    main.mensagensDeMarketing();
                    break;
                case "B":
                    System.out.println("B- Calculr o valor de tributos dos produtos");
                    main.calculoDeTributos();
                    break;
                case "C":
                    System.out.println("C- Calcular a área de uma figura geométrica");
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

    void mensagensDeMarketing(){}

    void calculoDeTributos(){}

    void calculoAreaFiguraGeometrica(){
        System.out.println("Escolha a figura geométrica:");
        System.out.println("1- Círculo");
        System.out.println("2- Retângulo");
        System.out.println("3- Quadrado");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        GeometricForm geometricForm;
        switch (opcao) {
            case 1:
                geometricForm = createCircle();
                break;
            case 2:
                geometricForm = createRectangle();
                break;
            case 3:
                geometricForm = createSquare();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        System.out.printf("A área da figura geométrica é: %.2f%n", geometricForm.getArea());
        
       scanner.nextLine(); // Limpar o buffer do scanner
    }
    private static GeometricForm createSquare(){
         System.out.println("Digite o tamanho dos lados: ");
            var side = scanner.nextDouble();
            return new Square(side);

    }
    private static GeometricForm createRectangle(){
        System.out.println("Digite o comprimento: ");
            var length = scanner.nextDouble();
            System.out.println("Digite a largura: ");
            var width = scanner.nextDouble();
            return new Rectangle(length, width);
    }
    private static GeometricForm createCircle(){
        System.out.println("Digite o raio: ");
            var radius = scanner.nextDouble();
            return new Circle(radius); 
    }
    

}
