import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    
    public static void main(String[] args) {

        try{
            FileWriter escritor = new FileWriter("Exemplo.txt", true);
            escritor.write("\nPrimeira linha");
            escritor.write("\nSegunda linha");
            escritor.close();
            System.out.println("Escrita concluida");
        }catch(IOException e){
            System.out.println("Erro ao escrever");
            e.printStackTrace();
        }
    }
}
