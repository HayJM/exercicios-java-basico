// Entrada
// A entrada deve receber uma string contendo os códigos das lojas e a quantidade de produtos, 
//separados por vírgulas. Cada loja e sua quantidade devem ser representadas no formato "codigo:quantidade".
// A entrada terá no máximo 1000 caracteres.

// Saída
// Deverá retornar uma string com os códigos das lojas e o total de produtos disponíveis em cada uma,
// no formato "codigo:total", separados por vírgulas.

// Entrada	                    Saída
// LOJA1:10,LOJA2:5,LOJA1:3	    LOJA1:13,LOJA2:5
// LOJA3:20,LOJA3:15,LOJA4:7	LOJA3:35,LOJA4:7
// LOJA5:8,LOJA6:12,LOJA5:4	    LOJA5:12,LOJA6:12



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class desafioJava02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String saida = organizarEstoque(entrada);

        System.out.println(saida);

        scanner.close();
    }

    public static String organizarEstoque(String entrada) {
        // TODO: Crie um mapa (LinkedHashMap) para armazenar o total de cada código mantendo a ordem de aparição
        Map<String, Integer> estoque = new LinkedHashMap<>();
        
        String[] lojas = entrada.split(",");

        for (String loja : lojas) {
            String[] partes = loja.split(":");
            String codigo = partes[0].trim();
            int quantidade = Integer.parseInt(partes[1].trim());

            // TODO: Atualize a quantidade total no mapa (soma com o valor atual, se já existir)
            estoque.put(codigo, estoque.getOrDefault(codigo, 0) + quantidade);

        }

        StringBuilder sb = new StringBuilder();

        // TODO: Itere sobre os pares do mapa e monta a string no formato "codigo:quantidade"
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
        }
        
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1); 
        }

        return sb.toString();
    }
}