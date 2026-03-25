package Funcionarios;

public class Tecnico extends Funcionario {
    private double adicional = 1000.00;

    public Tecnico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() + adicional;
    }

    public void exibirInfo() {
        System.out.println("--- Cargo: Técnico ---");
        super.exibirInfo();
    }
}