import java.util.Scanner;

public class ExerContadorPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("digite um número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        System.out.println("O número digitado é positivo!");
        sc.close();
    }
}

