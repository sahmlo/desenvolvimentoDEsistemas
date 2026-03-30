public class Carro extends Veiculo {
    private int qtdPortas;
    
    public Carro(String marca, int ano, int qtdPortas) {
        super(marca, ano);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("A quantidade de portas é: " + getQtdPortas());
    }
}
