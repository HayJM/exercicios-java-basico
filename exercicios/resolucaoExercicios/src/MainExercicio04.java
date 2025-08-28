import java.util.Scanner;

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
                    System.out.println("A- Cinema(tipos de ingresso)-implementar");
                    
                    break;
                case "B":
                    System.out.println("Loja(gerente, vendedor e atendente)-implementar");
                    
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

}
