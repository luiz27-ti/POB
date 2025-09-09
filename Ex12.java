import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Não forma triângulo");
        } else {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        }

        sc.close();
    }
}
