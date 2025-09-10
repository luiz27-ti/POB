import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a coordenada x1: ");
        double x1 = sc.nextDouble();
        
        System.out.print("Digite a coordenada y1: ");
        double y1 = sc.nextDouble();
        
        System.out.print("Digite a coordenada x2: ");
        double x2 = sc.nextDouble();
        
        System.out.print("Digite a coordenada y2: ");
        double y2 = sc.nextDouble();
        
        double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        
        System.out.print("A distância entre os dois pontos é: " + distancia);
        
        sc.close();
    }
}
