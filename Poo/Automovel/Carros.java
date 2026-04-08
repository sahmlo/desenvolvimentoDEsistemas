package Automovel;

public class Carros implements Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public Carros(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Carro:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
    }
    
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }
}
