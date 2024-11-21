import java.util.ArrayList;
import java.util.Random;

public class Esercizio_7{

    static public class Calciatore{
        public String nome;
        public String ruolo;

        // Costruttore
        public Calciatore(String nome, String ruolo){
            this.nome = nome;
            this.ruolo = ruolo;
        }
    }

    static public class Squadra{
        public ArrayList<Calciatore> listacalciatori;
        public Squadra(){
            listacalciatori = new ArrayList<Calciatore>();
        }
        public void aggiungigiocatore(Calciatore c){
            if (listacalciatori.size() < 12) {
                if (listacalciatori.contains(c)) {
                    System.out.println("Il giocatore già esiste in squadra!");
                } else {
                    listacalciatori.add(c);
                }
            } else {
                System.out.println("La squadra è già al completo");
            }
        }
        public void mostragiocatori(){
            for (Calciatore calciatore : listacalciatori) {
                System.out.println(calciatore);
            }
        }
    }

    static public class Partita{
        public Squadra squadrauno;
        public Squadra squadradue;

        public Partita(Squadra squadrauno, Squadra squadradue){
            this.squadrauno = squadrauno;
            this.squadradue = squadradue;
        }

        public void risultato(){
            Random rand = new Random();
            int punteggiouno = rand.nextInt(6);
            int punteggiodue = rand.nextInt(6);
            System.out.println("Risultato partita: ");
            System.out.println("Squadra 1 [" + punteggiouno + " - " + punteggiodue + "] Squadra 2");
            if (punteggiouno > punteggiodue) {
                System.out.println("Vincitore: Squadra 1");
            } else if (punteggiodue > punteggiouno) {
                System.out.println("Vincitore: Squadra 2");
            } else {
                System.out.println("Pareggio!");
            }
        }
    }

    public static void main(String[] args) {
        Calciatore calciatore1 = new Calciatore("Messi", "Attaccante");
        Calciatore calciatore2 = new Calciatore("CR7", "Attaccante");
        Squadra Barcellona = new Squadra();
        Squadra Real_Madrid = new Squadra();
        Barcellona.aggiungigiocatore(calciatore1);
        Real_Madrid.aggiungigiocatore(calciatore2);
        Partita clasico = new Partita(Barcellona, Real_Madrid);
        clasico.risultato();
    }
}