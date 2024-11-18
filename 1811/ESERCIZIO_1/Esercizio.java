import java.util.Scanner;
public class Esercizio {
    public static void main(String[] args){
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci Cognome: ");
        String cognome = scanner.nextLine();
        System.out.println("Benvenuto " + nome + " " + cognome);
        int prova = 0;
        while (prova == 0) {
            System.out.println("Inserisci un nome utente: ");
            String nomeutente = scanner.nextLine();
            if (nomeutente.indexOf(nome) == 0) {
                System.out.println("Il nome utente scelto va bene!");
                prova = 1;
            }
            System.err.println("Il nome utente scelto non va bene!");
        }
        do{
            System.out.println("Inserisci Password: ");
            password = scanner.nextLine();
            if (password.length() < 10) {
                System.err.println("La password non va bene! ");
            }
        } while(password.length() < 10);
    }
}