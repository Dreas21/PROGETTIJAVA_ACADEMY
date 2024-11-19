public class Esercizio_2 {
    public static void main(String[] args) {
        // inizializziamo un vettore che ci permette di inserire tutti i giorni della settimana
        String[] giornisettimana = {"Lunedì","Martedì","Mercoledì","Giovedì","Venerdì","Sabato","Domenica"};
        // ciclo FOR che ci permette di scorrere lungo l'array
        for(int i=1; i<=giornisettimana.length; i++){
            switch (i) {
                case 1:
                // stampiamo giornisettimana(i-1) in modo che ci ritroviamo con l'indice corretto!
                System.out.println("Il giorno della settimana: " + i + " - è: " + giornisettimana[i-1]);
                    break;
                case 2:
                System.out.println("Il giorno della settimana: " + i + " - è: " + giornisettimana[i-1]);
                    break;
                case 3:
                System.out.println("Il giorno della settimana: " + i + " - è: " + giornisettimana[i-1]);
                    break;
                case 4:
                System.out.println("Il giorno della settimana: " + i + " - è: " + giornisettimana[i-1]);
                    break;
                case 5:
                System.out.println("Il giorno della settimana: " + i + " - è: " + giornisettimana[i-1]);
                    break;
                case 6:
                System.out.println("Il giorno della settimana: " + i + " - è: " + giornisettimana[i-1]);
                    break;
                case 7:
                System.out.println("Il giorno della settimana: " + i + " - è: " + giornisettimana[i-1]);
                    break;
            }
        }
    }
}