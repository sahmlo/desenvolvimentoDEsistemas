package Funcionarios;

public class FuncionarioApp {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Amanda Medina", 5000.00);
        Tecnico t1 = new Tecnico("Sara Melo", 3000.00);

        g1.exibirInfo();
        System.out.println();
        t1.exibirInfo();
    }
}
