package Pagamento;

public class Pix implements Pagamento {

    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$%.2f realizado via Pix.\n", valor);
    }
}