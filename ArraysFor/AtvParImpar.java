// Atividade 3 - Números pares e ímpares

public class AtvParImpar {
    public static void main(String[] args) {
        System.out.println("Números ímpares: ");
        for (int i = 1; i <= 51; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Números pares: ");
        for (int i = 52; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

    }
}