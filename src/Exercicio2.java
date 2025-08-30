import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double resultado = Math.pow(base,expoente);

        System.out.println("O resultado é igual: " + resultado);
    }
}