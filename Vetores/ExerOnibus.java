package Vetores;
import java.util.Scanner;

public class ExerOnibus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxOnibus = 4;
        int maxReservas = 20;

        int qtdOnibus;
        int[] numerosOnibus;
        int[] assentos;

        String[] passageiros = new String[maxReservas];
        int[] onibusReserva = new int[maxReservas];

        int totalReservas = 0;
        
        System.out.print("Quantidade de ônibus (máx " + maxOnibus + "): ");
        qtdOnibus = sc.nextInt();

        if (qtdOnibus > maxOnibus) {
            qtdOnibus = maxOnibus;
        }

        numerosOnibus = new int[qtdOnibus];
        assentos = new int[qtdOnibus];

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Registrar número dos ônibus");
            System.out.println("2 - Registrar assentos dos ônibus");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar por ônibus");
            System.out.println("5 - Consultar por passageiro");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Número do ônibus " + (i + 1) + ": ");
                        numerosOnibus[i] = sc.nextInt();
                    }

                    break;

                case 2:

                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Assentos do ônibus " + numerosOnibus[i] + ": ");
                        assentos[i] = sc.nextInt();
                    }

                    break;

                case 3:

                    if (totalReservas >= maxReservas) {
                        System.out.println("Limite de reservas atingido!");
                        break;
                    }

                    System.out.print("Número do ônibus: ");
                    int numBus = sc.nextInt();

                    int indice = -1;

                    for (int i = 0; i < qtdOnibus; i++) {
                        if (numerosOnibus[i] == numBus) {
                            indice = i;
                        }
                    }

                    if (indice == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    if (assentos[indice] <= 0) {
                        System.out.println("Não há assentos disponíveis para este ônibus!");
                        break;
                    }

                    sc.nextLine();
                    System.out.print("Nome do passageiro: ");
                    String nome = sc.nextLine();

                    passageiros[totalReservas] = nome;
                    onibusReserva[totalReservas] = numBus;

                    assentos[indice]--;
                    totalReservas++;

                    System.out.println("Reserva realizada com sucesso!");

                    break;

                case 4:

                    System.out.print("Número do ônibus: ");
                    int consultaBus = sc.nextInt();

                    boolean existe = false;
                    boolean temReserva = false;

                    for (int i = 0; i < qtdOnibus; i++) {
                        if (numerosOnibus[i] == consultaBus) {
                            existe = true;
                        }
                    }

                    if (!existe) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    for (int i = 0; i < totalReservas; i++) {
                        if (onibusReserva[i] == consultaBus) {
                            System.out.println("Passageiro: " + passageiros[i]);
                            temReserva = true;
                        }
                    }

                    if (!temReserva) {
                        System.out.println("Não há reservas realizadas para este ônibus!");
                    }

                    break;

                case 5:

                    sc.nextLine();
                    System.out.print("Nome do passageiro: ");
                    String busca = sc.nextLine();

                    boolean encontrou = false;

                    for (int i = 0; i < totalReservas; i++) {

                        if (passageiros[i].equalsIgnoreCase(busca)) {
                            System.out.println("Reserva no ônibus: " + onibusReserva[i]);
                            encontrou = true;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }

                    break;

                case 6:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 6);

        sc.close();
    }
}