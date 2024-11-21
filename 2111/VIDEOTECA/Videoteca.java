import java.util.ArrayList;

public class Videoteca {
    private String nome;
    private ArrayList<Utente> clienti;
    private ArrayList<Film> listafilm;

    public Videoteca(String nome) {
        this.nome = nome;
        this.clienti = new ArrayList<Utente>();
        this.listafilm = new ArrayList<Film>();
    }

    public void aggiungiCliente(Utente u){
        if (this.clienti.contains(u)){
            System.out.println("L'UTENTE E' GIA' PRESENTE IN VIDEOTECA!");
        } else {
            this.clienti.add(u);
        }
    }

    public void aggiungiFilm(Film f){
        if (this.listafilm.contains(f)){
            System.out.println("IL FILM E' GIA' PRESENTE IN VIDEOTECA!");
        } else {
            this.listafilm.add(f);
        }
    }

    public void rimuoviFilm(Film f){
        if (this.listafilm.contains(f)) {
            this.listafilm.remove(this.listafilm.indexOf(f));
        } else {
            System.out.println("IL FILM NON E' PRESENTE IN VIDEOTECA!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Videoteca other = (Videoteca) obj;
        if (listafilm == null) {
            if (other.listafilm != null)
                return false;
        } else if (!listafilm.equals(other.listafilm))
            return false;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Utente> getClienti() {
        return clienti;
    }

    public void setClienti(ArrayList<Utente> clienti) {
        this.clienti = clienti;
    }

    public ArrayList<Film> getListafilm() {
        return listafilm;
    }

    public void setListafilm(ArrayList<Film> listafilm) {
        this.listafilm = listafilm;
    }

}