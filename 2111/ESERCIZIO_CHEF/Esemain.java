import java.util.ArrayList;
import java.util.Scanner;

public class Esemain {
    public static void main(String[] args) {
        Scanner scannerstring = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        ArrayList<Chef> listac = new ArrayList<Chef>();
        ArrayList<Critico> listacr = new ArrayList<Critico>();
        ArrayList<String> listap = new ArrayList<String>();
        ArrayList<Ristorante> listar = new ArrayList<Ristorante>();
        int sceltamenu;
        do {
            System.out.println("EFFETTUA UNA SCELTA:");
            System.out.println("1 - Crea Ristorante");
            System.out.println("2 - Inserisci CHEF");
            System.out.println("3 - Inserisci CRITICO");
            System.out.println("4 - Cucina nuovo piatto");
            System.out.println("5 - Critica piatto");
            System.out.println("6 - Fai cucinare piatto");
            System.out.println("0 - Termina programma");
            sceltamenu = scannerint.nextInt();
            switch (sceltamenu) {
                case 1:
                System.out.println("Inserisci il nome del ristorante:");
                String nomeris = scannerstring.nextLine();
                Ristorante r = new Ristorante(nomeris, listap);
                if (listar.isEmpty()) {
                    listar.add(r);
                } else {
                    if (listar.contains(r)) {
                        System.out.println("Il ristorante è già stato inserito");
                    } else {
                        listar.add(r);
                    }
                }
                break;
                case 2:
                    System.out.println("Inserisci il nome dell'utente");
                    String nomeu = scannerstring.nextLine();
                    if (listac.isEmpty()){
                        System.out.println("Inserisci email");
                        String emailc = scannerstring.nextLine();
                        Chef u = new Chef(nomeu,emailc);
                        listac.add(u);
                    } else {
                        if (listac.contains(nomeu)){
                            System.out.println("UTENTE GIA' LOGGATO");
                        } else {
                            System.out.println("Inserisci email");
                            String emailc = scannerstring.nextLine();
                            Chef u = new Chef(nomeu,emailc);
                            listac.add(u);
                        }   
                    }
                break;
                case 3:
                    System.out.println("Inserisci il nome dell'utente");
                    String nomec = scannerstring.nextLine();
                    if (listac.isEmpty()){
                        System.out.println("Inserisci email");
                        String emailc = scannerstring.nextLine();
                        Critico u = new Critico(nomec,emailc);
                        listacr.add(u);
                    } else {
                        if (listacr.contains(nomec)){
                            System.out.println("UTENTE GIA' LOGGATO");
                        } else {
                            System.out.println("Inserisci email");
                            String emailc = scannerstring.nextLine();
                            Critico u = new Critico(nomec,emailc);
                            listacr.add(u);
                        }   
                    }
                break;
                case 4:
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
                case 5:
                    if(listar.isEmpty()){
                        System.out.println("Non ci sono ristoranti nel sistema!");
                    } else{
                        System.out.println("Scegli il ristorante:");
                        for (int i=0; i<listar.size(); i++){
                            System.out.println(i + " - [" + listar.get(i).getNomer() + "]");
                        }
                        int sceltaris = scannerint.nextInt();
                        if(listacr.isEmpty()){
                            System.out.println("Non ci sono critici nel sistema!");
                        } else{
                            System.out.println("Scegli il critico:");
                            for (int i=0; i<listacr.size(); i++){
                                System.out.println(i + " - [" + listacr.get(i).getNome() + "]");
                            }
                            int sceltacri = scannerint.nextInt();
                            listar.get(sceltaris).faicriticarePiatto(listacr.get(sceltacri));
                        }
                    }
                break;
                case 6:
                    if(listar.isEmpty()){
                        System.out.println("Non ci sono ristoranti nel sistema!");
                    } else{
                        System.out.println("Scegli il ristorante:");
                        for (int i=0; i<listar.size(); i++){
                            System.out.println(i + " - [" + listar.get(i).getNomer() + "]");
                        }
                        int sceltaris = scannerint.nextInt();
                        if(listac.isEmpty()){
                            System.out.println("Non ci sono chef nel sistema!");
                        } else{
                            System.out.println("Scegli lo chef:");
                            for (int i=0; i<listac.size(); i++){
                                System.out.println(i + " - [" + listac.get(i).getNome() + "]");
                            }
                            int sceltach = scannerint.nextInt();
                            listar.get(sceltaris).faicucinarePiatto(listac.get(sceltach));
                        }
                    }
                break;
            }
        } while (sceltamenu != 0);
    }
}
