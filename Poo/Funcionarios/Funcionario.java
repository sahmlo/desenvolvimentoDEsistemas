package Funcionarios;

public class Funcionario {
    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public void getNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void getSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return getSalarioBase();
    }

    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Final: R$ " + calcularSalario());
    }
}
