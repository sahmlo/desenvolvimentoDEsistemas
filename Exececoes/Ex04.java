package Exececoes;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Digite um nome:");
            String nome = sc.nextLine();
            if (nome.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode estar vazio. Digite algum nome."); // Lança uma exceção personalizada se o nome estiver vazio
            }
            System.out.println("O nome digitado foi: " + nome);
        } catch (Exception e) { // Captura qualquer exceção que possa ocorrer
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado!");
        }
        sc.close();
    }
}
