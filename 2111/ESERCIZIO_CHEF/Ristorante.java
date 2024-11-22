import java.util.ArrayList;

public class Ristorante {
    private String nomer;
    private ArrayList<String> listapiatti;
    private ArrayList<Integer> valutazioni;
    
    public Ristorante(String nomer, ArrayList<String> listapiatti) {
        this.nomer = nomer;
        this.listapiatti = new ArrayList<String>();
        this.valutazioni = new ArrayList<Integer>();
    }

    public void faicucinarePiatto(Chef c){
        if (listapiatti.isEmpty()) {
            System.out.println("Non ci sono piatti da cucinare!");
        } else {
            c.cucinaPiatto(listapiatti);
        }
    }

    public void faicriticarePiatto(Critico cr){
        if (listapiatti.isEmpty()) {
            System.out.println("Non ci sono piatti da criticare!");
        } else {
            valutazioni.add(cr.criticaPiatto(listapiatti));
        }
    }

    public String getNomer() {
        return nomer;
    }

}