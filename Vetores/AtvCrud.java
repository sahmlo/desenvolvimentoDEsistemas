package Vetores;
import java.util.Scanner;

public class AtvCrud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] carros = new String[10];
        int opcao = 0;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite a marca do carro para cadastrar: ");
                    String nome = sc.nextLine();
                    boolean cadastrado = false;
                    for (int i = 0; i < carros.length; i++) {
                        if (carros[i] == null) {
                            carros[i] = nome;
                            cadastrado = true;
                            break;
                        }
                    }
                    if (!cadastrado) System.out.println("Erro: Cheio");
                    break;

                case 2:
                    listar(carros);
                    break;

                case 3:
                    listar(carros);
                    System.out.print("Posicao para alterar: ");
                    int posAlt = sc.nextInt();
                    sc.nextLine();
                    if (posAlt >= 0 && posAlt < carros.length && carros[posAlt] != null) {
                        System.out.print("Novo nome: ");
                        carros[posAlt] = sc.nextLine();
                    } else {
                        System.out.println("Invalido");
                    }
                    break;

                case 4:
                    listar(carros);
                    System.out.print("Posicao para remover: ");
                    int posRem = sc.nextInt();
                    sc.nextLine();
                    if (posRem >= 0 && posRem < carros.length && carros[posRem] != null) {
                        for (int i = posRem; i < carros.length - 1; i++) {
                            carros[i] = carros[i + 1];
                        }
                        carros[carros.length - 1] = null;
                    } else {
                        System.out.println("Invalido");
                    }
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalida");
            }
        }
    }

    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(i + " - " + array[i]);
            }
        }
    }
}