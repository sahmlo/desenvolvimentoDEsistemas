package Exececoes;

    public class Ex01 {

    public static void main(String[] args) {

        int a = 10; // valor que será dividido
        int b = 0;  // divisor (zero vai causar erro)

        try {
            // tenta executar esse bloco
            int resultado = a / b; // divisão por zero → gera erro

            // só executa se NÃO der erro
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            // captura erro de cálculo (ex: divisão por zero)
            System.out.println("Erro: Não é possível dividir por zero");

        } finally {
            // sempre executa (com erro ou sem erro)
            System.out.println("Programa finalizado!");
        }
    }
}
