// Atividade 6 - Menu de Tabuada e Contagem Regressiva

import java.util.Scanner;

public class AtvMenu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabela de Escolhas:");
        System.out.println("1 - Calcular Tabuada");
        System.out.println("2 - Realizar Contagem Regressiva");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o número para calcular a tabuada: ");
                int numero = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                break;
            case 2:
                System.out.print("Informe o número para contagem regressiva: ");
                int numeroRegressivo = sc.nextInt();
                for (int i = numeroRegressivo; i >= 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Contagem finalizada!");
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
        }
        sc.close();
    }
}