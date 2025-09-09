import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = sc.next();

        int idade = anoAtual - anoNascimento;
        System.out.println("Idade aproximada: " + idade);

        if (sexo.equalsIgnoreCase("M") && idade == 18) {
            System.out.println("Serviço Militar Obrigatório");
        } else {
            System.out.println("Isento de Serviço Militar");
        }

        sc.close();
    }
}
