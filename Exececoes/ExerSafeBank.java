package Exececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerSafeBank {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double saldoDisponivel = 2500.50;

        try {
            System.out.print("Digite o valor que deseja sacar: ");
            double valorSaque = sc.nextDouble();

            if (valorSaque < 0) {
                throw new IllegalAccessException("Valores negativos não são permitidos.");
            }

            if (valorSaque > saldoDisponivel) {
                throw new ArithmeticException("Saldo insuficiente para essa operação.");
            }

            saldoDisponivel -= valorSaque;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valorSaque);
            System.out.printf("Saldo atual: R$ %.2f%n", saldoDisponivel);
        } catch (InputMismatchException e) {
            
            System.err.println("Erro: Entrada inválida. Por favor, digite apenas números.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            
            System.err.println("Erro na operação: " + e.getMessage());
        } catch (Exception e) {
            
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            
            System.out.println("Operação encerrada.");
        }
        sc.close();
    }
}
