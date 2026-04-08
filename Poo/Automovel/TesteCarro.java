package Automovel;

public class TesteCarro {
    public static void main(String[] args) {
        Carros carro1 = new Carros("Civic", "Honda", 2020, 90000);
        Carros carro2 = new Carros("Corolla", "Toyota", 2021, 95000);

        carro1.exibirDetalhes();
        System.out.println();
        carro2.exibirDetalhes();
    }
    
}
