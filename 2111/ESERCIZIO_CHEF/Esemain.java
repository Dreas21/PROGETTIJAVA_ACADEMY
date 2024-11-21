import java.util.ArrayList;
import java.util.Scanner;

public class Esemain {
    public static void main(String[] args) {
        Scanner scannerstring = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        ArrayList<Chef> listac = new ArrayList<Chef>();
        ArrayList<String> listap = new ArrayList<String>();
        ArrayList<Integer> val = new ArrayList<Integer>();
        int sceltamenu;
        do {
            System.out.println("EFFETTUA UNA SCELTA:");
            System.out.println("1 - Inserisci Utente");
            System.out.println("2 - Cucina piatto");
            sceltamenu = scannerint.nextInt();
            switch (sceltamenu) {
                case 1:
                    System.out.println("Inserisci il nome dell'utente");
                    String nomeu = scannerstring.nextLine();
                    if (listac.isEmpty()){
                        System.out.println("Inserisci email");
                        String emailc = scannerstring.nextLine();
                        Chef u = new Chef(nomeu,emailc);
                        System.out.println("Che tipo di utente è: [CHEF/CRITICO]");
                        String utch = scannerstring.nextLine();
                        if (utch.contains("CHEF")) {
                            listac.add(u);
                        }
                    } else {
                        if (listac.contains(nomeu)){
                            System.out.println("UTENTE GIA' LOGGATO");
                        } else {
                            System.out.println("Inserisci email");
                            String emailc = scannerstring.nextLine();
                            Chef u = new Chef(nomeu,emailc);
                            System.out.println("Che tipo di utente è: [CHEF/CRITICO]");
                            String utch = scannerstring.nextLine();
                            if (utch.contains("CHEF")) {
                                listac.add(u);
                            }
                        }   
                    }
                break;
                case 2:
                    System.out.println("Inserisci il piatto che vuoi cucinare");
                    String piatto = scannerstring.nextLine();
                    listap.add(piatto);
                    System.out.println(piatto);
                    System.out.println("SELEZIONA LO CHEF CHE INTENDE CUCINARE IL PIATTO:");
                    for(int i=0; i<listac.size(); i++){
                        System.out.println(i + " - [ " + listac.get(i).getNome() + " ]");
                    }
                    int sceltachef = scannerint.nextInt();
                    System.out.println("Lo chef " + listac.get(sceltachef).getNome() + " ha preparato il piatto: " + piatto);
                break;
            }
        } while (sceltamenu != 3);
    }
}
