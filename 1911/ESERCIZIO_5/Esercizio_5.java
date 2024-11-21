import java.util.ArrayList;
import java.util.Scanner;
public class Esercizio_5 {
    public static void main(String[] args) {
        int scelta;
        ArrayList<ArrayList<Integer>> listaspedizioni = new ArrayList<ArrayList<Integer>>();
        do {
            Scanner scannerint = new Scanner(System.in);
            System.out.println();
            // menu che permette di scegliere quale funzione eseguire
            System.out.println("COSA VUOI EFFETTUARE?");
            System.out.println("1 - Aggiungere una spedizione");
            System.out.println("2 - Visualizzare tutte le spedizioni");
            System.out.println("3 - Stampa le spedizioni totali");
            System.out.println("4 - Cerca spedizione di un determinato colore");
            System.out.println("5 - Arresta il programma");
            scelta = scannerint.nextInt();
            switch (scelta) {
                case 1:
                    // mettiamo i numeri di penne nella spedizione
                    System.out.println("Inserisci il numero di penne rosse: ");
                    int rosse = scannerint.nextInt();
                    System.out.println("Inserisci il numero di penne blu: ");
                    int blu = scannerint.nextInt();
                    System.out.println("Inserisci il numero di penne verdi: ");
                    int verdi = scannerint.nextInt();
                    System.out.println("Inserisci il numero di penne nere: ");
                    int nere = scannerint.nextInt();
                    /* eseguiamo il metodo aggiungiSpedizione che aggiunge ad una lista una nuova lista
                     * che contiene i numeri di tutte le penne in una spedizione
                     */
                    listaspedizioni.add(aggiungiSpedizione(rosse, blu, verdi, nere));
                break;
                case 2:
                    // tutte le funzioni successive avranno bisogno come input di una listaspedizioni
                    stampaSpedizioni(listaspedizioni);
                break;
                case 3:
                    stampaSpedizionitotali(listaspedizioni);
                break;
                case 4:
                    cercaPrenotazioni(listaspedizioni);
                break;
            }
        } while (scelta != 5);
    }
    public static ArrayList<Integer> aggiungiSpedizione(int r, int b, int v, int n){
        // diamo in pasto alla funzione i numeri delle penne di un determinato tipo che vengono spedite
        ArrayList<Integer> spedizione = new ArrayList<Integer>();
        spedizione.add(r);
        spedizione.add(b);
        spedizione.add(v);
        spedizione.add(n);
        // ci tornerà indietro una lista di valori [r,b,v,n]
        return spedizione;
    }

    public static void stampaSpedizioni(ArrayList<ArrayList<Integer>> lp){
        if (lp.isEmpty()){
            System.out.println("NON ABBIAMO REGISTRATO SPEDIZIONI");
        } else {
            for (int i = 0; i < lp.size(); i++){
                // mostriamo a schermo in ogni singola spedizione quante penne di vario colore abbiamo mandato [r, b, v, n]
                System.out.println("Nella spedizione " + i + " avremo: " + lp.get(i));
            }
        }
    }

    public static void stampaSpedizionitotali(ArrayList<ArrayList<Integer>> lp){
        ArrayList<Integer> totalespedizioni = new ArrayList<Integer>();
        if (lp.isEmpty()){
            System.out.println("NON ABBIAMO REGISTRATO SPEDIZIONI");
        } else {
            int temp = 0;
            do {
                int somma = 0;
                for (int i = 0; i < lp.size(); i++){
                    // ci calcoliamo la somma di tutte le spedizioni per ogni colore e andiamo a memorizzarle all'interno di un altro arraylist
                    somma = somma + lp.get(i).get(temp);
                }
                totalespedizioni.add(somma);
                temp = temp + 1;
            } while (temp < 4);
            System.out.println("Abbiamo spedito: " + totalespedizioni);
        }
    }

    public static void cercaPrenotazioni(ArrayList<ArrayList<Integer>> lp){
        int scegli;
        Scanner scannerint = new Scanner(System.in);
        // menu per la scelta del colore da stampare
        System.out.println("Di quale colore vuoi effettuare la ricerca?");
        System.out.println("1 - ROSSO");
        System.out.println("2 - BLU");
        System.out.println("3 - VERDE");
        System.out.println("4 - NERO");
        do {
            scegli = scannerint.nextInt();
        } while (scegli > 4 || scegli < 1);
        // per mantenere il codice "pulito" utilizziamo il metodo stamparisultato
        stampaRisultato(scegli, lp);
    }

    /* con questo metodo, in base alla scelta fatta precedentemente stamperemo la lista delle spedizioni
     * per un determinato colore
     */  
    public static void stampaRisultato(Integer s, ArrayList<ArrayList<Integer>> lp){
        String colore = "vuoto";
        switch (s) {
        case 1:
            colore = "rosse";
        break;
        case 2:
            colore = "blu";
        break;
        case 3:
            colore = "verdi";
        break;
        case 4:
            colore = "nere";
        break;
        }
        for (int i = 0; i < lp.size(); i++){
            if (lp.get(i).get(s-1) != 0){
                System.out.println("Nella spedizione " + i + " avremo: " + lp.get(i).get(s-1) + " penne " + colore);
            } else {
                System.out.println("Nella spedizione " + i + " non avremo penne " + colore);
            }
        }        
    }
}