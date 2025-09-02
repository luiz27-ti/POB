import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {
        
Scanner sc = new Scanner(System.in);

System.out.println("Digite n1 e n2:");
int n1 = sc.nextInt();
int n2 = sc.nextInt();

if(n1 >= n2) {
    System.out.printf("%d\n", n1);
} else {
    System.out.printf("%d\n", n2);
}

sc.close(); 

}

}
