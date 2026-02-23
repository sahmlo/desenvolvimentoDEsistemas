public class ExerContador {
    public static void main(String[] args) {
        int contador = 0;
        
        System.out.println("Iniciando contagem...");
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 5);
        System.out.println("Contagem finalizada!");
    }
}
