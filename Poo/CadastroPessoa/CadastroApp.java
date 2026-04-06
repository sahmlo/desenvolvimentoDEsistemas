package CadastroPessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroApp {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Alterar");
            System.out.println("4. Remover");
            System.out.println("5. Pesquisar");
            System.out.println("0. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    alterar();
                    break;
                case 4:
                    remover();
                    break;
                case 5:
                    pesquisar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrar() {
        System.out.print("Tipo (1-Aluno | 2-Professor): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();
            pessoas.add(new Aluno(nome, idade, matricula));
        } else if (tipo == 2) {
            System.out.print("Disciplina: ");
            String disciplina = scanner.nextLine();
            pessoas.add(new Professor(nome, idade, disciplina));
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    private static void listar() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (int i = 0; i < pessoas.size(); i++) {
                Pessoa p = pessoas.get(i);
                if (p instanceof Aluno) {
                    System.out.println("Tipo: Aluno");
                } else if (p instanceof Professor) {
                    System.out.println("Tipo: Professor");
                } else {
                    System.out.println("Tipo: Pessoa");
                }
                p.exibirInfo();
                System.out.println("---");
            }
        }
    }

    private static void alterar() {
        System.out.print("Nome da pessoa para alterar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.print("Novo nome: ");
                String nome = scanner.nextLine();
                p.setNome(nome);

                System.out.print("Nova idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                p.setIdade(idade);

                if (p instanceof Aluno) {
                    System.out.print("Nova matrícula: ");
                    int novaMatricula = scanner.nextInt();
                    scanner.nextLine();
                    ((Aluno) p).setMatricula(novaMatricula);
                } else if (p instanceof Professor) {
                    System.out.print("Nova disciplina: ");
                    String disciplina = scanner.nextLine();
                    ((Professor) p).setDisciplina(disciplina);
                }
                System.out.println("Pessoa alterada com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pessoa não encontrada.");
        }
    }

    private static void remover() {
        System.out.print("Nome da pessoa a remover: ");
        String nomeBusca = scanner.nextLine();

        boolean removido = false;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equalsIgnoreCase(nomeBusca)) {
                pessoas.remove(i);
                System.out.println("Pessoa removida com sucesso.");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Pessoa não encontrada.");
        }
    }

    private static void pesquisar() {
        System.out.print("Nome a pesquisar: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.exibirInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pessoa não encontrada.");
        }
    }
}

