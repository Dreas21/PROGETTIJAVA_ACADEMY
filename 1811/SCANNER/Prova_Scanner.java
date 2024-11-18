import java.util.Scanner;
public class Prova_Scanner {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Inizializzazione di tipo SCANNER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci Username");
        String userName = scanner.nextLine();
        System.out.println("L'username è: " + userName);
        System.out.println("La lunghezza della stringa è: " + userName.length());
    }
}