import java.util.Scanner;

public class LoopDoWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("1 - Cadastro");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Informe a opção desejada: ");
            op = sc.nextInt();
        
            switch(op){
                case 1:
                    System.out.println("Cadastro");
                    break;
                case 2:
                    System.out.println("Listar");
                    break;
                case 3:
                    System.out.println("Remover");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(op != 4);
        sc.close();
    }
}