import java.util.ArrayList;

public class Utente {
    private int idutente;
    private String nome;
    private ArrayList<Film> filmnoleggiati;
    
    public Utente(int idutente, String nome) {
        this.idutente = idutente;
        this.nome = nome;
        this.filmnoleggiati = new ArrayList<Film>();
    }

    public void noleggiaFilm(Film f){
        if (this.filmnoleggiati.isEmpty()){
            this.filmnoleggiati.add(f);
        } else {
            if (this.filmnoleggiati.contains(f)) {
                System.out.println("IL FILM E' GIA' STATO NOLEGGIATO");
            }
        }
    }

    public void elencoNoleggi(){
        System.out.println("I FILM NOLEGGIATI DALL'UTENTE " + this.nome + " SONO: ");
        for(int i=0; i<this.filmnoleggiati.size(); i++){
            System.out.println("[" + this.filmnoleggiati.get(i).getTitolo() + "]");
        }
    }

    public int getIdutente() {
        return idutente;
    }

    public void setIdutente(int idutente) {
        this.idutente = idutente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Film> getFilmnoleggiati() {
        return filmnoleggiati;
    }

    public void setFilmnoleggiati(ArrayList<Film> filmnoleggiati) {
        this.filmnoleggiati = filmnoleggiati;
    }

}
