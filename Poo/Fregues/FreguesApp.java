public class FreguesApp {
    public static void main(String[] args) {
        FreguesPf Pf = new FreguesPf("Sara", "Rua A, 123", "123.456.789-00");
        FreguesPj Pj = new FreguesPj("João", "Rua A, 123", "123.456.789-00");

        System.out.println("Fregues PF:");
        System.out.println("Nome: " + Pf.getNome());
        System.out.println("Endereço: " + Pf.getEndereco());
        System.out.println("CPF: " + Pf.getCpf());  
        System.out.println("\nFregues PJ:");
        System.out.println("Nome: " + Pj.getNome());    
        System.out.println("Endereço: " + Pj.getEndereco());
        System.out.println("CNPJ: " + Pj.getCnpj());

        
        
    }
}
