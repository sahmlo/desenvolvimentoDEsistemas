public class VeiculoApp {
    public static void main(String[] args) {
      
        System.out.println("--- Dados da Moto ---");
        Moto minhaMoto = new Moto("Honda", 2023, 500);
        minhaMoto.exibirInfo();
        
        System.out.println(); 
        
        System.out.println("--- Dados do Carro ---");
        Carro meuCarro = new Carro("Toyota", 2021, 4);
        meuCarro.exibirInfo();
    }
}