import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        ArrayList<Videoteca> listavideoteca = new ArrayList<Videoteca>();
        ArrayList<Utente> listautenti = new ArrayList<Utente>();
        Scanner scannerstr = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        int scelta;
        
        do {
            System.out.println("");
            System.out.println("SCEGLI OPERAZIONE:");
            System.out.println("1 - CREA VIDEOTECA");
            System.out.println("2 - CREA FILM");
            System.out.println("3 - CREA UTENTE");
            System.out.println("4 - NOLEGGIA FILM");
            System.out.println("5 - VISUALIZZA NOLEGGI");
            System.out.println("6 - RIMUOVI FILM");
            System.out.println("7 - TERMINA PROGRAMMA");
            System.out.println("");
            scelta = scannerint.nextInt();
            switch (scelta) {
                case 1:
                    creaVideoteca(listavideoteca);
                break;
                case 2:
                    creaFilm(listavideoteca);
                break;
                case 3:
                    creaUtente(listautenti);
                break;
                case 4:
                    sceltaNoleggio(listavideoteca, listautenti);
                break;
                case 5:
                    visualizzaNoleggi(listautenti);
                break;
                case 6:
                    cancellaFilm(listavideoteca);
                break;
            }
        } while (scelta != 7 || scelta < 1 || scelta > 7);
    }

    public static void creaVideoteca(ArrayList<Videoteca> l){
    System.out.println("INSERISCI IL NOME DELLA VIDEOTECA:");
    Scanner scannerstr = new Scanner(System.in);
    String nomevid = scannerstr.nextLine();
    Videoteca videos = new Videoteca(nomevid);
    if (l.isEmpty()) {
        l.add(videos);
    } else {
        if (l.equals(videos)){
            System.out.println("LA VIDEOTECA E' GIA' PRESENTE NEL SISTEMA!");
        } else {
            l.add(videos);
            }
        }
    }

    public static void creaFilm(ArrayList<Videoteca> l){
        Scanner scannerstr = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        System.out.println("INSERISCI IL NOME DEL FILM:");
        String nomefilm = scannerstr.nextLine();
        System.out.println("INSERISCI ANNO DEL FILM:");
        int annofilm = scannerint.nextInt();
        Film f = new Film(nomefilm, annofilm);
        if (l.isEmpty()){
            System.out.println("NON CI SONO VIDEOTECHE!");
        } else {
            System.out.println("IN QUALE VIDEOTECA LO VUOI INSERIRE:");
            for (int i=0; i<l.size(); i++){
                System.out.println(i + " - [" + l.get(i).getNome() + "]");
            }
            int scv = scannerint.nextInt();
            l.get(scv).aggiungiFilm(f);
        }
    }

    public static void creaUtente(ArrayList<Utente> lu){
        Scanner scannerstr = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        System.out.println("INSERISCI IL NOME DELL'UTENTE:");
        String nomeutente = scannerstr.nextLine();
        System.out.println("INSERISCI ID UTENTE");
        int idutente = scannerstr.nextInt();
        Utente u = new Utente(idutente, nomeutente);
        if (lu.isEmpty()) {
            lu.add(u);
        } else {
            if (lu.equals(u)){
                System.out.println("L'UTENTE E' GIA' PRESENTE NEL SISTEMA");
            } else {
                lu.add(u);
            }
        }
    }

    public static void sceltaNoleggio(ArrayList<Videoteca> l, ArrayList<Utente> lu){
        Scanner scannerstr = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        System.out.println("QUALE UTENTE VUOLE NOLEGGIARE UN FILM?");
        for (int i=0; i<lu.size(); i++){
            System.out.println(i + " - [" + lu.get(i).getNome() + "]");
        }
        int other_s = scannerint.nextInt();
        Utente scelta_s = lu.get(other_s);
        System.out.println("DA QUALE VIDEOTECA VUOI NOLEGGIARE UN FILM?");
        for (int i=0; i<l.size(); i++){
            System.out.println(i + " - [" + l.get(i).getNome() + "]");
        }
        int scvdue_s = scannerint.nextInt();
        System.out.println("SCEGLI UN FILM DA NOLEGGIARE:");
        for (int i=0; i<l.get(scvdue_s).getListafilm().size(); i++){
            System.out.println(i + " - [" + l.get(scvdue_s).getListafilm().get(i).getTitolo() + "]");
        }
        int scvdue_iii = scannerint.nextInt();
        scelta_s.noleggiaFilm(l.get(scvdue_s).getListafilm().get(scvdue_iii));
    }

    public static void visualizzaNoleggi(ArrayList<Utente> lu){
        Scanner scannerstr = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        System.out.println("DI QUALE UTENTE VUOI VEDERE LA LISTA");
        for (int i=0; i<lu.size(); i++){
            System.out.println(i + " - [" + lu.get(i).getNome() + "]");
        }
        int nome_u = scannerint.nextInt();
        Utente utente_u = lu.get(nome_u);
        utente_u.elencoNoleggi();
    }

    public static void cancellaFilm(ArrayList<Videoteca> l){
        Scanner scannerint = new Scanner(System.in);
        System.out.println("DA QUALE VIDEOTECA VUOI CANCELLARE UN FILM?");
        for (int i=0; i<l.size(); i++){
            System.out.println(i + " - [" + l.get(i).getNome() + "]");
        }
        int ennesimascelta = scannerint.nextInt();
        System.out.println("SCEGLI UN FILM DA CANCELLARE:");
        for (int i=0; i<l.get(ennesimascelta).getListafilm().size(); i++){
            System.out.println(i + " - [" + l.get(ennesimascelta).getListafilm().get(i).getTitolo() + "]");
        }
        int ennesimasceltadue = scannerint.nextInt();
        l.get(ennesimascelta).rimuoviFilm(l.get(ennesimascelta).getListafilm().get(ennesimasceltadue));
    }

}