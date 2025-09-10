import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        
        double pi = 3.14159;
        double volume = (4.0 / 3.0) * pi * (raio * raio * raio);
        
        System.out.print("O volume da esfera é: " + volume);
        
        sc.close();
    }
}
