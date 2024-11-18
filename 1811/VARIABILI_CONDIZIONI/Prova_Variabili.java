public class Prova_Variabili {
    public static void main(String[] args) {
        // Prima linea di codice
        System.out.println("Ciao a tutti");

        // Inizializzazione variabili
        String parteuno;
        String partedue;
        parteuno = "HELLO";
        partedue = " WORLD";
        String partecompleta = parteuno + partedue;
        System.out.println(partecompleta);

        // Dichiarazione cascata condivisa
        int x,y,z;
        x = y = z = 547;
        System.out.println(x+y*z);
    }
}