import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite seu salario bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("digite seu sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        double salarioLiquido;

        if (sexo == 'M') {
            salarioLiquido = salarioBruto * 0.95; 
        } else {
            salarioLiquido = salarioBruto * 0.97; 
        }

        System.out.printf("salario liquido: R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}
