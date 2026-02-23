import java.util.Scanner;

public class ExerNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome + "!");
        sc.close();
    }
}
