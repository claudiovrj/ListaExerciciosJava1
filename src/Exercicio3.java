import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("numero1");
        int numero1 = scanner.nextInt();
        System.out.println("numero2: ");
        int numero2 = scanner.nextInt();
        double resultado = (numero1*numero1) + (numero2*numero2);
        System.out.println("O resultado é igual: " + resultado);
    }
}
