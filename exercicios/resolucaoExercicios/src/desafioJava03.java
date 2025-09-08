import java.util.Scanner;

// TODO: Crie a classe que representa um Cliente:
class Cliente {   
    // TODO: Crie o construtor para inicializar os atributos:
    private String nome;
    private String email;   
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    } 
    // TODO: Implemente os métodos getters:
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

        
}
public class desafioJava03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada
        String nome = scanner.next();
        String email = scanner.next();

        // TODO: Crie o objeto cliente com os dados fornecidos:
        Cliente cliente = new Cliente(nome, email);

        // Exibe a mensagem formatada conforme solicitado
        System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso! Email: " + cliente.getEmail());

        scanner.close();
    }
}


// Descrição:
// Uma loja de roupas está começando a criar um sistema para cadastrar clientes. Você deve criar uma classe chamada Cliente que armazene as informações nome e email. Depois, o programa deve instanciar um objeto dessa classe usando os dados fornecidos pelo usuário e exibir uma mensagem de boas-vindas para o cliente.

// Esse será o primeiro passo para construir um sistema mais completo de fidelidade, que será expandido no próximo desafio.

// Entrada:
// O programa deve receber os seguintes dados, digitados na mesma linha e separados por espaços:

// Nome do cliente (String, apenas uma palavra);
// Email do cliente (String).

// Saída:
// O programa deve exibir uma mensagem de boas-vindas no seguinte formato:

// Cliente [nome] cadastrado com sucesso! Email: [email]
// Exemplos
// A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

// Entrada	                      Saída
// Ana ana@email.com	          Cliente Ana cadastrado com sucesso! Email: ana@email.com
// Joao joao@email.com	          Cliente Joao cadastrado com sucesso! Email: joao@email.com
// Maria maria@email.com	      Cliente Maria cadastrado com sucesso! Email: maria@email.com


// Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descrição do desafio de código.




