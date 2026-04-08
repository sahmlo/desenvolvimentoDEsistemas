package FormaGeometrica;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
    }
}