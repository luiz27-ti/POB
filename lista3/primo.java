import java.util.Scanner;

public class NumerosPrimosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o número final do intervalo: ");
        int fim = scanner.nextInt();

System.out.println("Números primos entre " + inicio + " e " + fim + ":");

        for (int num = inicio; num <= fim; num++) {
            if (num < 2) {
                continue; 
            }

            boolean primo = true;

            for (int divisor = 2; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
