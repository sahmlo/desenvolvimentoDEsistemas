package Vetores;

public class VetoresFor {
    public static void main(String[] args) {
        int numeros [] = {10,20,30,40,50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posisão "+i+"="+numeros[i]);
        }
        System.out.println(numeros[1]);
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
