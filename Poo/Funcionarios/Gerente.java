package Funcionarios;

public class Gerente extends Funcionario {
    private double bonus = 2000.00;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    public void exibirInfo() {
        System.out.println("--- Cargo: Gerente ---");
        super.exibirInfo();
    }
}
