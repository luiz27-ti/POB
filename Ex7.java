import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("digite o numero inteiro: ");
        
        int n = sc.nextInt();
        
        if(n > 0) {
             System.out.print("o numero é positivo");
        
        } else {
            
            if(n < 0) {
                 System.out.print("o numero é negativo");
        
            }
            
            else {
                System.out.print("o numero é nulo");
            }
        }
        
        sc.close();
}

}
