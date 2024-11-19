import java.util.Scanner;
public class Esercizio_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // inseriamo il numero da controllare
        int numero;
        do{
            System.out.println("Inserisci numero: ");
            numero = scanner.nextInt();
            // calcoliamo il resto della divisione per 2
            int resto = numero%2;
            // se il resto della divisione per 2 sarà = 0 allora il numero cercato sarà pari, altrimenti no
            if(resto == 0){
                System.out.println("Il numero inserito è pari|");
            } else {
                System.out.println("Il numero inserito è dispari!");
            }
        // continuiamo ad iterare fino a quando il numero inserito non sarà minore di 0
        }while (numero >= 0);
    }
}