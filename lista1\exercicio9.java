import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor em reais (R$): ");
        double reais = sc.nextDouble();
        
        System.out.print("Digite a cotação do dólar: ");
        double cotacao = sc.nextDouble();
        
        double dolares = reais / cotacao;
        
        System.out.print("O valor em dólares é: " + dolares);
        
        sc.close();
    }
}
