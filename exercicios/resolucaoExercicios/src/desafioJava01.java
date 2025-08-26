import java.math.BigDecimal;
import java.util.Scanner;

public class desafioJava01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;
       
        // TODO: Verifique se o valor é menor que 50.00:
        if(valor.compareTo(new BigDecimal("50.00")) < 0){
          descontoPercentual = new BigDecimal("0.0");
          
        }
       // TODO: Verifique se o valor é entre 50.00 e 100.00 (inclusive):
        else if(valor.compareTo(new BigDecimal("100.00")) <= 0){
          descontoPercentual = new BigDecimal("0.1");
          
        }
        // TODO: Caso contrário, o valor é maior que 100.00:
        else{
          descontoPercentual = new BigDecimal("0.2");
        }
        // TODO: Retorne a string formatada com o desconto aplicado, conforme exigido no desafio:
        return String.format("Desconto de %d%%", descontoPercentual.multiply(new BigDecimal("100")).intValue());

    }
}