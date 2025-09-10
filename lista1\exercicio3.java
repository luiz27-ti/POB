import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("digite a temperatura em celsius");
        
        double celsius = sc.nextDouble();
        
        double fare = sc.nextDouble();
    
         fare = (celsius * 9/5) + 32;
         
         System.out.print(" a temperatura em fare é"+ fare);
         
         sc.close();
         
    }
    
}
