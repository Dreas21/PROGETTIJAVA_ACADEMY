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
                    System.out.println("INSERISCI IL NOME DELLA VIDEOTECA:");
                    String nomevid = scannerstr.nextLine();
                    Videoteca videos = new Videoteca(nomevid);
                    if (listavideoteca.isEmpty()) {
                        listavideoteca.add(videos);
                    } else {
                        if (listavideoteca.equals(videos)){
                            System.out.println("LA VIDEOTECA E' GIA' PRESENTE NEL SISTEMA!");
                        } else {
                            listavideoteca.add(videos);
                        }
                    }
                break;
                case 2:
                    System.out.println("INSERISCI IL NOME DEL FILM:");
                    String nomefilm = scannerstr.nextLine();
                    System.out.println("INSERISCI ANNO DEL FILM:");
                    int annofilm = scannerint.nextInt();
                    Film f = new Film(nomefilm, annofilm);
                    if (listavideoteca.isEmpty()){
                        System.out.println("NON CI SONO VIDEOTECHE!");
                    } else {
                        System.out.println("IN QUALE VIDEOTECA LO VUOI INSERIRE:");
                        for (int i=0; i<listavideoteca.size(); i++){
                            System.out.println(i + " - [" + listavideoteca.get(i).getNome() + "]");
                        }
                        int scv = scannerint.nextInt();
                        listavideoteca.get(scv).aggiungiFilm(f);
                    }
                break;
                case 3:
                    System.out.println("INSERISCI IL NOME DELL'UTENTE:");
                    String nomeutente = scannerstr.nextLine();
                    System.out.println("INSERISCI ID UTENTE");
                    int idutente = scannerstr.nextInt();
                    Utente u = new Utente(idutente, nomeutente);
                    if (listautenti.isEmpty()) {
                        listautenti.add(u);
                    } else {
                        if (listautenti.equals(u)){
                            System.out.println("L'UTENTE E' GIA' PRESENTE NEL SISTEMA");
                        } else {
                            listautenti.add(u);
                        }
                    }
                break;
                case 4:
                    System.out.println("QUALE UTENTE VUOLE NOLEGGIARE UN FILM?");
                    for (int i=0; i<listautenti.size(); i++){
                        System.out.println(i + " - [" + listautenti.get(i).getNome() + "]");
                    }
                    int other_s = scannerint.nextInt();
                    Utente scelta_s = listautenti.get(other_s);
                    System.out.println("DA QUALE VIDEOTECA VUOI NOLEGGIARE UN FILM?");
                    for (int i=0; i<listavideoteca.size(); i++){
                        System.out.println(i + " - [" + listavideoteca.get(i).getNome() + "]");
                    }
                    int scvdue_s = scannerint.nextInt();
                    System.out.println("SCEGLI UN FILM DA NOLEGGIARE:");
                    for (int i=0; i<listavideoteca.get(scvdue_s).getListafilm().size(); i++){
                        System.out.println(i + " - [" + listavideoteca.get(scvdue_s).getListafilm().get(i).getTitolo() + "]");
                    }
                    int scvdue_iii = scannerint.nextInt();
                    scelta_s.noleggiaFilm(listavideoteca.get(scvdue_s).getListafilm().get(scvdue_iii));
                break;
                case 5:
                    System.out.println("DI QUALE UTENTE VUOI VEDERE LA LISTA");
                    for (int i=0; i<listautenti.size(); i++){
                        System.out.println(i + " - [" + listautenti.get(i).getNome() + "]");
                    }
                    int nome_u = scannerint.nextInt();
                    Utente utente_u = listautenti.get(nome_u);
                    utente_u.elencoNoleggi();
                break;
                case 6:
                    System.out.println("DA QUALE VIDEOTECA VUOI CANCELLARE UN FILM?");
                    for (int i=0; i<listavideoteca.size(); i++){
                    System.out.println(i + " - [" + listavideoteca.get(i).getNome() + "]");
                    }
                    int ennesimascelta = scannerint.nextInt();
                    System.out.println("SCEGLI UN FILM DA CANCELLARE:");
                    for (int i=0; i<listavideoteca.get(ennesimascelta).getListafilm().size(); i++){
                        System.out.println(i + " - [" + listavideoteca.get(ennesimascelta).getListafilm().get(i).getTitolo() + "]");
                    }
                    int ennesimasceltadue = scannerint.nextInt();
                    listavideoteca.get(ennesimascelta).getListafilm().remove(ennesimasceltadue);
                break;
            }
        } while (scelta != 7 || scelta < 1 || scelta > 7);
    }
}