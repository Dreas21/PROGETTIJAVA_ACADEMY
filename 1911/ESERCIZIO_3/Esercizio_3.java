import java.util.Scanner;
public class Esercizio_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Inserisci numero: ");
            numero = scanner.nextInt();
            int resto = numero%2;
            if(resto == 0){
                System.out.println("Il numero inserito è pari|");
            } else {
                System.out.println("Il numero inserito è dispari!");
            }
        }while (numero >= 0);
    }
}