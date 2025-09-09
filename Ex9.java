import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        System.out.println("Média inicial: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.print("Digite a terceira nota (peso 2): ");
            double nota3 = sc.nextDouble();

            double novaMedia = (nota1 + nota2 + (nota3 * 2)) / 4.0;
            System.out.println("Nova média: " + novaMedia);

            if (novaMedia >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }

        sc.close();
    }
}
