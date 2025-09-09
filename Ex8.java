import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas disciplinas não alcançaram a média: ");
        int disciplinas = sc.nextInt();
        
        if (disciplinas == 0) {
            System.out.println("Aprovado");
        } else if (disciplinas <= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        
        sc.close();
    }
}
