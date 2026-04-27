import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuOptionpane {
    public static void main(String[]args){
        ArrayList<String> produtos = new ArrayList<>();
        boolean executando=true;

        while(executando){
            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção:\n 1 - Cadastrar \n 2 - Listar\n 3 - Sair", "MENU", JOptionPane.QUESTION_MESSAGE);

            if(opcao==null){
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                break;
            }

            switch (opcao) {

                case "1":
                    String nomeProduto = JOptionPane.showInputDialog(null, "Digite o nome do produto: ", "Cadastro de Produtos", JOptionPane.QUESTION_MESSAGE);
                    if(nomeProduto==null || nomeProduto.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Produto não cadastrado.");
                    }else{
                        produtos.add(nomeProduto);
                        JOptionPane.showMessageDialog(null, "Produto '" + nomeProduto + "' cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;
            
                case "2":
                    if(produtos.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado.");
                    }else{
                        String lista = ("Produtos cadastrados:\n");
                        for (int i=0;i<produtos.size();i++){
                            lista+=(i+1)+ "-" +produtos.get(i);
                        }
                        JOptionPane.showMessageDialog(null, lista, "Lista de Produtos", JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
                    break;
            }
        }
    }
    
}