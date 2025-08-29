public class exe02 {
    public static void main(String[] args){
        exe02 ex = new exe02();
        System.out.println("Exercício 1:");
        ex.execA();
        System.out.println("\nExercício 2:");
        ex.execB();
        System.out.println("\nExercício 3:");
        ex.execC();
        System.out.println("\nExercício 4:");
        ex.execD();

    }

    void execA() {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
    
    void execB() {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }
        scanner.close();
    }

    void execC() {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int num2 = scanner.nextInt();
        while (num2 <= num1) {
            System.out.print("O segundo número deve ser maior que o primeiro. Digite novamente: ");
            num2 = scanner.nextInt();
        }

        System.out.print("Digite 'par' para números pares ou 'impar' para números ímpares: ");
        String escolha = scanner.next().toLowerCase();

        System.out.println("Números " + escolha + " entre " + num1 + " e " + num2 + " em ordem decrescente:");
        for (int i = num2; i >= num1; i--) {
            if (escolha.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    void execD() {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int numInicial = scanner.nextInt();

        while (true) {
            System.out.print("Digite outro número (ou um número menor que " + numInicial + " para sair): ");
            int num = scanner.nextInt();
            if (num < numInicial) {
                System.out.println("Número menor que o inicial. Encerrando...");
                break;
            }
            if (num % numInicial != 0) {
                System.out.println("O número " + num + " não é divisível por " + numInicial + ". Encerrando...");
                break;
            }
            System.out.println("O número " + num + " é divisível por " + numInicial + ".");
        }
        scanner.close();
    }

}
