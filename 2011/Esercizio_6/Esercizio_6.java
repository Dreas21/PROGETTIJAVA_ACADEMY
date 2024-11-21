import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio_6{
    
    static class Libro {
        public String autore;
        public int numPagine;
    
        // Costruttore
        public Libro(String autore, int numPagine) {
            this.autore = autore;
            this.numPagine = numPagine;
        }
    }

    static class Biblioteca {
        // La voglio considerare una lista di libri
        ArrayList<Libro> libri;
    
        // Costruttore
        public Biblioteca() {
            libri = new ArrayList<Libro>();
        }
    
        // Metodo per aggiungere un libro alla biblioteca
        public void aggiungiLibro(Libro libro) {
            libri.add(libro);
        }
    
        // Metodo per stampare tutti i libri della biblioteca
        public void stampaLibri() {
            if (libri.isEmpty()) {
                System.out.println("La biblioteca è vuota.");
            } else {
                for (Libro libro : libri) {
                    System.out.println("Autore: " + libro.autore + ", Numero di pagine: " + libro.numPagine);
                }
            }
        }

        // Metodo per cercare i libri
        public void cercaPerAutore(String autore) {
            boolean trovato = false;
            for (Libro libro : libri) {
                if (libro.autore.equals(autore)) {
                    System.out.println("Autore: " + libro.autore + ", Numero di pagine: " + libro.numPagine);
                    trovato = true;
                }
            }
            if (!trovato) {
                System.out.println("Nessun libro trovato per l'autore " + autore + ".");
            }
        }

        // Metodo per cercare i libri
        public void cercaPerMaxPagine(int maxPagine) {
            boolean trovato = false;
            for (Libro libro : libri) {
                if (libro.numPagine <= maxPagine) {
                    System.out.println("Autore: " + libro.autore + ", Numero di pagine: " + libro.numPagine);
                    trovato = true;
                }
            }
            if (!trovato) {
                System.out.println("Nessun libro trovato con un numero di pagine inferiore o uguale a " + maxPagine + ".");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scannerstring = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        Libro libro1 = new Libro("J.R.R. Tolkien", 500);
        Libro libro2 = new Libro("J.K. Rowling", 250);

        Biblioteca brucoli = new Biblioteca();
        brucoli.aggiungiLibro(libro1);
        brucoli.aggiungiLibro(libro2);

        System.out.println("Inserisci il nome dell'autore:");
        String autoreric = scannerstring.nextLine();
        brucoli.cercaPerAutore(autoreric);
        System.out.println("Inserisci il numero pagine del libro:");
        int pagric = scannerint.nextInt();
        brucoli.cercaPerMaxPagine(pagric);
    }
}