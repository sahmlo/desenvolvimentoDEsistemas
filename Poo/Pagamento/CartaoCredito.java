package Pagamento;

public class CartaoCredito implements Pagamento {
    
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$%.2f realizado com Cartão de Crédito.\n", valor);
    }
}