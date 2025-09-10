import java.util.Scanner;

public class exercicio6
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);

		System.out.println("digite o salario bruto: ");
		
		double salarioB = sc.nextDouble();
		
		double salarioL = salarioB * 0.95;
		
		System.out.println("seu salario com o desconto é: "+ salarioL);
		
		sc.close();
		
	}
}
