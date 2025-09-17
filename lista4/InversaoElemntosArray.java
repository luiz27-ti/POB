import java.util.Scanner;

public class InversaoElementosArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Os números na ordem inversa são:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
