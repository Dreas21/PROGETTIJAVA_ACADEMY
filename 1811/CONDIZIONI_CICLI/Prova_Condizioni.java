import java.util.Scanner;
public class Prova_Condizioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci primo numero: ");
        int x = scanner.nextInt();
        System.out.println("Inserisci secondo numero: ");
        int y = scanner.nextInt();
        // una volta letti i nostri numeri proviamo a confrontarli fra di loro
        if (x > y) {
            System.out.println("il numero: " + x + " è maggiore del numero: " + y);
        } else {
            System.out.println("il numero: " + y + " è maggiore del numero: " + x);
        }
    }
}
