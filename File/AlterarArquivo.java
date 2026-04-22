public class AlterarArquivo {
    public static void main(String[] args) {
    String caminho ="arquivo.txt";

    try {
        java.io.FileWriter writer = new java.io.FileWriter(caminho);
        writer.write("Conteúdo atualizado");
        writer.write("Este é um exemplo de alteração de arquivo.");
        writer.close();
        System.out.println("Arquivo criado com sucesso!");
    } catch (java.io.IOException e) {
        System.out.println("Ocorreu um erro ao criar o arquivo.");
        e.printStackTrace();

    
    }
}