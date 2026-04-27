import javax.swing.JOptionPane;

public class CaixaConfirmacao {
    public static void main(String[] args) {
        int reposta = JOptionPane.showConfirmDialog(null,"Deseja continuar?","Confirmação",JOptionPane.YES_NO_OPTION);

        if (reposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu Sim.", "Resposta", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu Não.", "Resposta", JOptionPane.WARNING_MESSAGE);
        }
    }
}
