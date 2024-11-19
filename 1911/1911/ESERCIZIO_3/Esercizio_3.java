import java.util.Scanner;
public class Esercizio_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // inseriamo il numero da controllare
        int numero;
        int dimensione = 10;
        int[] listanumeri = new int[dimensione];
        int i = 0;
        do{
            System.out.println("Inserisci numero: ");
            numero = scanner.nextInt();
            listanumeri[i] = numero;
            i=i+1;
            // calcoliamo il resto della divisione per 2
            int resto = numero%2;
            // se il resto della divisione per 2 sarà = 0 allora il numero cercato sarà pari, altrimenti no
            if(resto == 0){
                System.out.println("Il numero inserito è pari|");
            } else {
                System.out.println("Il numero inserito è dispari!");
            }
        // continuiamo ad iterare fino a quando il numero inserito non sarà minore di 0
        }while (numero >= 0 && i < (dimensione));
        for(int j=0; j<=i; j++){
            if (listanumeri[j]!=0) {
                System.out.println("L'elemento " + j + " del vettore è: " + listanumeri[j]);
            }
        }
    }
}