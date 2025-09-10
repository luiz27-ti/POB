import java.util.Scanner;

public class exercicio4 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            
        System.out.print("digite n1");
        
        double n1 = sc.nextDouble();
        
        System.out.print("digite 2");
        
        double n2 = sc.nextDouble();
        
        System.out.print("digite n3");
        
        double n3 = sc.nextDouble();
        
        double soma = sc.nextDouble();
        
        soma = (n1 +  n2 + n3) / 3;
        
        System.out.print(" a media aritimetica é %2.f"+ soma);
         
        }
}
