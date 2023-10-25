import java.util.Scanner;

public class Statistiche {
    
    public static void main(String[] args) {
        System.out.println("Inserisci il testo (termina con ctrl+Z): ");

        Scanner s = new Scanner(System.in);
        int linee = 0;
        double somma = 0;
        String testo = "";

        while(s.hasNext()){
            testo += s.nextLine() +" ";
            linee++;
        }
        s.close();

        String[] parole = testo.split(" ");
        for (String word : parole) {
            somma += word.length();
        }

        System.out.println("Statistiche:\n");
        System.out.println("Numero linee: " + linee);
        System.out.println("Numero parole: " + parole.length);
        System.out.println("Lunghezza media: " + somma/parole.length );
    }
}
