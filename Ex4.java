import java.util.Scanner;

public class Ex4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("digite um numero: "); 
            
            int numero = sc.nextInt();
            
            if(numero %2 == 0) {
                System.out.printf("o numero é par");
            }
                else {
                 
                     System.out.printf("o numero é impar");
                }
            
          sc.close();
    }
  
}
