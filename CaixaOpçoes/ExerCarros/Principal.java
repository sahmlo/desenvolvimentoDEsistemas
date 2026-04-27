import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Carro> listaCarros = new ArrayList<>();
        int opcao = 0;

        do {
            String menu = "SISTEMA DE CADASTRO DE CARROS \n" +
                          "1 - Cadastrar Carro\n" +
                          "2 - Listar Carros\n" +
                          "3 - Detalhar Carro\n" +
                          "4 - Alterar Carro\n" +
                          "5 - Remover Carro\n" +
                          "6 - Gravar em Arquivo\n" +
                          "7 - Sair\n\n" +
                          "Escolha uma opção: ";
            
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (opcao) {
                    case 1:
                        String marca = JOptionPane.showInputDialog("Marca:");
                        String modelo = JOptionPane.showInputDialog("Modelo:");
                        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
                        listaCarros.add(new Carro(marca, modelo, ano));
                        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                        break;

                    case 2:
                        if (listaCarros.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                        } else {
                            String lista = "--- Carros Cadastrados ---\n";
                            for (int i = 0; i < listaCarros.size(); i++) {
                                lista += i + " - " + listaCarros.get(i).getMarca() + " " + listaCarros.get(i).getModelo() + "\n";
                            }
                            JOptionPane.showMessageDialog(null, lista);
                        }
                        break;

                    case 3:
                        int idDetalho = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do carro:"));
                        JOptionPane.showMessageDialog(null, listaCarros.get(idDetalho).exibirDetalhes());
                        break;

                    case 4:
                        int idAltera = Integer.parseInt(JOptionPane.showInputDialog("Número do carro a alterar:"));
                        String nMarca = JOptionPane.showInputDialog("Nova Marca:");
                        String nModelo = JOptionPane.showInputDialog("Novo Modelo:");
                        int nAno = Integer.parseInt(JOptionPane.showInputDialog("Novo Ano:"));
                        listaCarros.set(idAltera, new Carro(nMarca, nModelo, nAno));
                        JOptionPane.showMessageDialog(null, "Dados atualizados!");
                        break;

                    case 5:
                        int idRemove = Integer.parseInt(JOptionPane.showInputDialog("Número do carro a remover:"));
                        listaCarros.remove(idRemove);
                        JOptionPane.showMessageDialog(null, "Carro removido!");
                        break;

                    case 6:
                        try (FileWriter fw = new FileWriter("carros.txt");
                             PrintWriter pw = new PrintWriter(fw)) {
                            for (Carro c : listaCarros) {
                                pw.println("Marca: " + c.getMarca() + " | Modelo: " + c.getModelo() + " | Ano: " + c.getAno());
                            }
                            JOptionPane.showMessageDialog(null, "Dados gravados em 'carros.txt'!");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo.");
                        }
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida ou operação cancelada.");
            }

        } while (opcao != 7);
    }
}