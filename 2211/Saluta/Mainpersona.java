import java.util.Scanner;

public class Mainpersona{
    public static void main(String[] args) {
        String nuovapersona;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci nome persona: ");
        nuovapersona = scanner.nextLine();
        Persona persona = new Persona();
        persona.saluta(nuovapersona);
        System.out.println();
        System.out.println("Inserisci nome pirata: ");
        nuovapersona = scanner.nextLine();
        Pirata pirata = new Pirata();
        pirata.saluta(nuovapersona);
    }
}