import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("numero1");
        int numero1 = scanner.nextInt();
        System.out.println("numero2");
        int numero2 = scanner.nextInt();
        System.out.println("O consecutivo do numero1 é: " + (numero1+1));
        System.out.println("O consecutivo do numero2 é: " + (numero2+1));
    }
}