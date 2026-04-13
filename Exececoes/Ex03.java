package Exececoes;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            System.out.println("O número digitado foi: " + numero);
        } catch (Exception e) {
            System.out.println("Erro:Você deve digitar um número inteiro.");

        } finally {
            
            System.out.println("Programa finalizado!");
        }
        sc.close();
    }
}
