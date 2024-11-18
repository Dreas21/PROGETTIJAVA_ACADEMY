import java.util.Scanner;
public class Esercizio {
    public static void main(String[] args){
        // inizializziamo la variabile password che potrebbe causare conflitti
        String password;
        // inizializziamo lo scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci Cognome: ");
        String cognome = scanner.nextLine();
        System.out.println("Benvenuto " + nome + " " + cognome);

        // inizializziamo una variabile prova che servirà ad entrare nel ciclo
        int prova = 0;
        while (prova == 0) {
            System.out.println("Inserisci un nome utente: ");
            String nomeutente = scanner.nextLine();
            // questo controllo permette di non avere la stringa nome all'interno di nomeutente
            if (nomeutente.contains(nome)) {
                System.err.println("Il nome utente scelto non va bene!");
            }
            else {
                System.out.println("Il nome utente scelto va bene!");
                // questo assegnamento permette di settare il nostro 'flag' su ON per farci uscire dal ciclo
                prova = 1;
            }
        }

        // il ciclo do-while parte e controlla successivamente la condizione sulla lunghezza
        do{
            System.out.println("Inserisci Password: ");
            password = scanner.nextLine();
            if (password.length() < 10) {
                System.err.println("La password non va bene! ");
            }
        } while(password.length() < 10);
    }
}