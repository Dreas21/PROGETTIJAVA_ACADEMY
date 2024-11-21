import java.util.ArrayList;
import java.util.Scanner;

public class Chef extends User{
    private String nome;
    private String email;
    private Scanner scannerint = new Scanner(System.in);
    
    public Chef(String nome, String email) {
        super.nome = nome;
        super.email = email;
        super.soldi = random.nextInt(1000);
    }

    protected void cucinaPiatto(ArrayList<String> l) {
        System.out.println("Seleziona il piatto da cucinare: ");
        for(int i = 0; i < l.size(); i++){
            System.out.println("[ "+ l.get(i) +" ]");
        }
        int scelta = scannerint.nextInt();
        System.out.println("Lo chef " + this.nome + " ha cucinato: " + l.get(scelta));
    }
}