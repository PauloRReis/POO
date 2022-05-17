import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = Integer.valueOf(scanner.nextLine());

        System.out.println("Naturais:");
        Naturais naturais = new Naturais(){};
        naturais.gerar(n);
        System.out.println(naturais.getSequencia());

        System.out.println("Abundantes:");
        Abundantes Abundantes = new Abundantes() {
        };
        naturais.gerar(n);
        System.out.println(Abundantes.getSequencia());
    
    }
}