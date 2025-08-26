public class exe01 {
    void execA() {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        int idade = java.time.Year.now().getValue() - anoNascimento;
        
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        scanner.close();
    }
    
    void execB() {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();
        
        double areaQuadrado = lado * lado;
        
        System.out.println("A área do quadrado é: " + areaQuadrado);
        scanner.close();
    }

    void execC() {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        
        double areaRetangulo = base * altura;
        
        System.out.println("A área do retângulo é: " + areaRetangulo);
        scanner.close();
    }

    void execD() {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        
        int diferencaIdade = Math.abs(idade1 - idade2);
        
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaIdade + " anos.");
        scanner.close();
    }
    public static void main(String[] args) throws Exception {
        exe01 exe = new exe01();
        System.out.println("Exercício 1:");
        exe.execA();
        System.out.println("\nExercício 2:");
        exe.execB();
        System.out.println("\nExercício 3:");
        exe.execC();
        System.out.println("\nExercício 4:");
        exe.execD();
    }
}
