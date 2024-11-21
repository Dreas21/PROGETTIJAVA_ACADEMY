import java.util.ArrayList;

public class Ristorante {
    private String nomer;
    private ArrayList<String> listapiatti;
    private ArrayList<Integer> valutazioni;
    
    public Ristorante(String nomer, ArrayList<String> listapiatti, ArrayList<Integer> valutazioni) {
        this.nomer = nomer;
        this.listapiatti = new ArrayList<String>();
        this.valutazioni = new ArrayList<Integer>();
    }

}
