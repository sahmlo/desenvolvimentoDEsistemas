import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        int opcao;

        do{
            System.out.println("Escolha a opção:");
            System.out.println("1 - Adicionar animal");
            System.out.println("2 - Fazer som");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo do animal (1 - Cachorro / 2 - Gato): ");
                    int escolha = sc.nextInt();

                    if (escolha == 1) {
                        animais.add(new Cachorro());
                        System.out.println("Cachorro adicionado!");
                    } else if (escolha == 2) {
                        animais.add(new Gato());
                        System.out.println("Gato adicionado!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado!");
                        break;
                    }
                    System.out.println("Escolha o animal:");
                    for (int i = 0; i < animais.size(); i++) {
                        System.out.println((i + 1) + " - " + animais.get(i).getClass().getSimpleName());
                    }
                    int animalEscolhido = sc.nextInt();
                    if (animalEscolhido >= 1 && animalEscolhido <= animais.size()) {
                        animais.get(animalEscolhido - 1).fazerSom();
                    } else {
                        System.out.println("Animal inválido!");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
            }
        } while(opcao != 3);

        
        sc.close();
    }
}
