package ArraysList;
import java.util.ArrayList;
public class Arlist01 {
    public static void main(String[] args) {

        // Adicionando elementos a um ArrayList
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Amanda");
        nomes.add("Mariana Victoria");
        nomes.add("Emy");

        // Listando os elementos do ArrayList
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}