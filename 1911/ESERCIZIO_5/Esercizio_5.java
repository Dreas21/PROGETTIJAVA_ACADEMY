import java.util.ArrayList;
import java.util.Scanner;
public class Esercizio_5 {
    public static void main(String[] args) {
        int scelta;
        ArrayList<ArrayList<Integer>> listaspedizioni = new ArrayList<ArrayList<Integer>>();
        do {
            Scanner scannerint = new Scanner(System.in);
            System.out.println();
            System.out.println("COSA VUOI EFFETTUARE?");
            System.out.println("1 - Aggiungere una spedizione");
            System.out.println("2 - Visualizzare tutte le spedizioni");
            System.out.println("3 - Stampa le spedizioni totali");
            System.out.println("4 - Cerca spedizione di un determinato colore");
            System.out.println("5 - Arresta il programma");
            scelta = scannerint.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il numero di penne rosse: ");
                    int rosse = scannerint.nextInt();
                    System.out.println("Inserisci il numero di penne blu: ");
                    int blu = scannerint.nextInt();
                    System.out.println("Inserisci il numero di penne verdi: ");
                    int verdi = scannerint.nextInt();
                    System.out.println("Inserisci il numero di penne nere: ");
                    int nere = scannerint.nextInt();
                    listaspedizioni.add(aggiungiSpedizione(rosse, blu, verdi, nere));
                break;
                case 2:
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
        ArrayList<Integer> spedizione = new ArrayList<Integer>();
        spedizione.add(r);
        spedizione.add(b);
        spedizione.add(v);
        spedizione.add(n);
        return spedizione;
    }

    public static void stampaSpedizioni(ArrayList<ArrayList<Integer>> lp){
        if (lp.isEmpty()){
            System.out.println("NON ABBIAMO REGISTRATO SPEDIZIONI");
        } else {
            for (int i = 0; i < lp.size(); i++){
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
                    somma = somma + lp.get(i).get(temp);
                }
                totalespedizioni.add(somma);
                temp = temp + 1;
            } while (temp < 4);
            System.out.println("Abbiamo spedito: " + totalespedizioni);
        }
    }

    public static void cercaPrenotazioni(ArrayList<ArrayList<Integer>> lp){
        System.out.println("Di quale colore vuoi effettuare la ricerca?");
        System.out.println("1 - ROSSO");
        System.out.println("2 - BLU");
        System.out.println("3 - VERDE");
        System.out.println("4 - NERO");
        Scanner scannerint = new Scanner(System.in);
        int scegli = scannerint.nextInt();
        switch (scegli) {
            case 1:
            for (int i = 0; i < lp.size(); i++){
                if (lp.get(i).get(0) != 0){
                    System.out.println("Nella spedizione " + i + " avremo: " + lp.get(i).get(0) + " penne rosse");
                } else {
                    System.out.println("Nella spedizione " + i + " non avremo penne rosse");
                }
            }
            break;
            case 2:
            for (int i = 0; i < lp.size(); i++){
                if (lp.get(i).get(1) != 0){
                    System.out.println("Nella spedizione " + i + " avremo: " + lp.get(i).get(1) + " penne blu");
                } else {
                    System.out.println("Nella spedizione " + i + " non avremo penne blu");
                }
            }
            break;
            case 3:
            for (int i = 0; i < lp.size(); i++){
                if (lp.get(i).get(2) != 0){
                    System.out.println("Nella spedizione " + i + " avremo: " + lp.get(i).get(2) + " penne verdi");
                } else {
                    System.out.println("Nella spedizione " + i + " non avremo penne verdi");
                }
            }
            break;
            case 4:
            for (int i = 0; i < lp.size(); i++){
                if (lp.get(i).get(3) != 0){
                    System.out.println("Nella spedizione " + i + " avremo: " + lp.get(i).get(3) + " penne nere");
                } else {
                    System.out.println("Nella spedizione " + i + " non avremo penne nere");
                }
            }
            break;
        }
    }
}