package Exececoes;

    public class Ex02 {

    public static void main(String[] args) {

        int [] numeros = {10, 20, 30};

        try {
            System.out.println(numeros[5]);

        } catch (ArithmeticException e) {
            System.out.println("Erro:Indice fora do limite do Array.");

        } finally {
            
            System.out.println("Programa finalizado!");
        }
    }
}
