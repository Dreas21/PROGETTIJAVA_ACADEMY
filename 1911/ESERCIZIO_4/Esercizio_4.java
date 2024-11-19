import java.util.Scanner;
import java.util.ArrayList;
public class Esercizio_4 {
    public static void main(String[] args) {
        // inizializzo due oggetti scanner, uno per gli interi ed uno per le stringhe
        Scanner scannerint = new Scanner(System.in);
        Scanner scanners = new Scanner(System.in);
        String nomecliente;
        int riga;
        int colonna;
        /* per la gestione dei posti utilizzerò un arraylist con al suo interno
         * un ulteriore arraylist per mantenere in memoria sia riga che colonna all'interno di una struttura
         */
        ArrayList<String> nomi = new ArrayList<String>();
        ArrayList<ArrayList<Integer>> prenotazione = new ArrayList<ArrayList<Integer>>();
        // utilizzo una variabile che mi permette di scegliere da un menu quale scelta effettuare
        int scelta;
        do{
            System.out.println();
            System.out.println("Cosa desideri effettuare?");
            System.out.println("1 - prenotare un posto");
            System.out.println("2 - cercare prenotazione");
            System.out.println("3 - visualizzare i posti disponibili");
            System.out.println("4 - stampare report");
            System.out.println("5 - cancella prenotazione");
            System.out.println("6 - esci dal programma");
            System.out.println();
            scelta = scannerint.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome di chi vuole effettuare la prenotazione: ");
                    nomecliente = scanners.nextLine();
                    do {
                        System.out.println("Inserisci riga: ");
                        riga = scannerint.nextInt();
                        System.out.println("Inserisci colonna: ");
                        colonna = scannerint.nextInt();
                        if (riga > 3 || colonna > 8) {
                            System.out.println("Il posto scelto non va bene!");
                            System.out.println();
                        } else {
                            ArrayList<Integer> posti = new ArrayList<Integer>();
                            // aggiungiamo alla posizione subito disponibile un valore che contiene [riga, colonna]
                            posti.add(riga);
                            posti.add(colonna);
                            if (prenotazione.isEmpty()) {
                                // aggiungiamo all'arraylist dei nomi il valore
                                nomi.add(nomecliente);
                                prenotazione.add(posti);
                                System.out.println("Il posto scelto va bene!");
                            } else {
                                if (prenotazione.contains(posti)){
                                    System.out.println("Il posto scelto è già occupato!");
                                } else {
                                    nomi.add(nomecliente);
                                    prenotazione.add(posti);
                                    System.out.println("Il posto scelto va bene!");
                                }
                            }
                            System.out.println();
                        }
                    } while (riga > 3 || colonna > 8);
                break;
                case 2:
                    // controlliamo inizialmente se sono state effettuate delle prenotazioni
                    if (nomi.isEmpty()) {
                        System.out.println("Non ci sono prenotazioni nel sistema!");
                        System.out.println();
                    } else {
                        System.out.println("Inserisci il nome da cercare: ");
                        String nomericerca = scanners.nextLine();
                        // utilizziamo il metodo contains per verificare se all'interno dell'arraylist già troviamo il nome richiesto
                        if (nomi.contains(nomericerca)){
                            int i = nomi.indexOf(nomericerca);
                            System.out.println("ABBIAMO TROVATO CORRISPONDENZA!");
                            // stampiamo a schermo il risultato in base all'indice corrispondente
                            System.out.println("Il posto prenotato dall'utente " + nomi.get(i) + " è --> " + prenotazione.get(i));
                            System.out.println();
                        } else {
                            System.out.println("NON ABBIAMO TROVATO CORRISPONDENZA!");
                        }
                    }
                break;
                case 3:
                    System.out.println("Stato dei posti:");
                    for (int i = 0; i < 3; i++) {
                        System.out.println();
                        for (int j = 0; j < 8; j++) {
                            // creo un altro arraylist da confrontare con gli elementi contenuti all'interno di "prenotazione"
                            ArrayList<Integer> check = new ArrayList<Integer>();
                            check.add(i);
                            check.add(j);
                            if (prenotazione.contains(check)){
                                System.out.print("[X] "); // posto trovato occupato
                            } else {
                                System.out.print("[ ] "); // posto trovato libero
                            }
                        }
                    }
                    System.out.println();
                break;
                case 4:
                    // creo il REPORT dei posti
                    double postitotali = 3*8;
                    double percentualeliberi;
                    double percentualeoccupati;
                    if (nomi.isEmpty()) {
                        System.out.println("I posti liberi sono: " + postitotali);
                    } else {
                        double postiliberi = postitotali - nomi.size();
                        percentualeliberi = (postiliberi/postitotali)*100;
                        percentualeoccupati = (nomi.size()/postitotali)*100;
                        System.out.println("La percentuale dei posti liberi è --> " + percentualeliberi + "%");
                        System.out.println("La percentuale dei posti occupati è --> " + percentualeoccupati + "%");
                        System.out.println("I posti liberi sono: " + postiliberi);
                    }
                break;
                case 5:
                    if (nomi.isEmpty()) {
                        System.out.println("Non ci sono prenotazioni nel sistema!");
                        System.out.println();
                    } else {
                        System.out.println("Chi desidera cancellare la prenotazione?");
                        System.out.println(nomi);
                        boolean valido = false;
                        while (valido == false) {
                            String controllo = scanners.nextLine();
                            if (nomi.contains(controllo)) {
                                // ci andiamo a trovare l'indice della variabile per la quale abbiamo trovato corrispondenza
                                int indicerimozione = nomi.indexOf(controllo);
                                // rimuoviamo gli elementi richiesti mediante il metodo remove degli arraylist
                                nomi.remove(controllo);
                                prenotazione.remove(indicerimozione);
                                valido = true;
                            }
                            else {
                                System.out.println("La prenotazione da te cercata non esiste!");
                            }
                        }
                    }
                break;
            }
        }while(scelta != 6);
        System.out.println("Il programma è terminato!");
    }
}