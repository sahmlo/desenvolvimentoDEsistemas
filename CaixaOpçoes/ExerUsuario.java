import javax.swing.JOptionPane;

public class ExerUsuario {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");

        String inputIdade = JOptionPane.showInputDialog("Digite a sua idade:");
        int idade = Integer.parseInt(inputIdade);

        String statusIdade = (idade >= 18) ? "maior de idade" : "menor de idade";

        String mensagem = "Nome: " + nome + "\n" +
                          "Idade: " + idade + " anos\n" +
                          "Você é " + statusIdade + ".";
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}