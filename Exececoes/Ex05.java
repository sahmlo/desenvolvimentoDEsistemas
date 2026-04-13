package Exececoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = -1;
        while(op!=0){
            try {
                System.out.println("\n Menu ");
                System.out.println("1 - Adicionar");
                System.out.println("2- Listar");
                System.out.println("3- Remover item");
                System.out.println("0- Sair");
                op=sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("Digite um nome: ");
                        String nome = sc.nextLine();
                        lista.add(nome);
                        System.out.println("Nome adicionado com sucesso!");
                        break;
                    case 2:
                        
                        break;
                    case 3:
                       
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                sc.nextLine(); 
            }
        }

        sc.close();
    }
}
