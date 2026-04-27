public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public String exibirDetalhes() {
        return " Detalhes do Carro \n" +
               "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Ano: " + ano + "\n" ;
        }
}