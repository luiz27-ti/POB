import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
    
     Scanner sc = new Scanner(System.in);
        
        System.out.print("digite seu ano de nascimento: "); 
            
            int ano = sc.nextInt();
            
            if(ano <= 2009) {
                System.out.printf("Apto a ser eleitor");
            } else {
                   System.out.printf("Inapto a ser eleitor");
            }
            
            sc.close();
}

}
