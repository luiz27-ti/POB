import java.util.Scanner;

public class contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        
        if (numero < 0) {
            System.out.println("Número inválido. Digite um número positivo.");
        } else {
           
            do {
                System.out.println(numero);
                numero--; 
            } while (numero >= 0);
        }

        scanner.close();
    }
}
