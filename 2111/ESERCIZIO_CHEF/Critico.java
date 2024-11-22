import java.util.ArrayList;
import java.util.Scanner;

public class Critico extends User{
    private String nome;
    private String email;
    private Scanner scannerint = new Scanner(System.in);
    
    public Critico(String nome, String email) {
        super.nome = nome;
        super.email = email;
        super.soldi = random.nextInt(1000);
    }

    protected int criticaPiatto(ArrayList<String> l) {
        System.out.println("Seleziona il piatto da criticare: ");
        for(int i = 0; i < l.size(); i++){
            System.out.println("[ "+ l.get(i) +" ]");
        }
        int scelta = scannerint.nextInt();
        System.out.println("Che votazione vuoi dare: ");
        int vot = scannerint.nextInt();
        System.out.println("Il critico " + this.nome + " ha criticato: [" + l.get(scelta) + "] con la votazione di -->" + vot);
        return vot;
    }
}