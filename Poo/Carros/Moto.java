public class Moto extends Veiculo {
    private int cilindrada;
    
    public Moto(String marca, int ano, int cilindrada) {
        super(marca, ano); 
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void exibirInfo() {
        super.exibirInfo(); // Chama o exibirInfo da classe pai
        System.out.println("A cilindrada é: " + getCilindrada() + "cc");
    }
}
