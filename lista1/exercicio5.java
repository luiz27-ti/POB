import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
        
        System.out.print("digite quantos anos voce tem: "); 
        
        int ano = sc.nextInt();
        
        int dias = ano * 365;
        
        System.out.print("numero de dias: "+ dias); 
        
        sc.close();
        
        
    }
}

