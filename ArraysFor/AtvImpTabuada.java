// Ativiadade 4 - Tabuada de 1 a 10

public class AtvImpTabuada {
    public static void main(String[] args) {
       for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
    }
}