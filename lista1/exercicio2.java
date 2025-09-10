import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        
        double pi = 3.14;
        double area = pi * raio * raio;
        
        System.out.print("A área do círculo é: " + area);
        
        sc.close();
    }
}
