import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.print("A soma dos dois números é: " + soma);
        
        sc.close();
    }
}
