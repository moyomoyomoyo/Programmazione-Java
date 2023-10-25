import java.util.Scanner;

public class Farfallino {
    // il programma non funziona con le vocali accentate (not my fault, it's Java frfr)
    public static void main(String[] args) {
        System.out.println("Inserisci il testo (termina con ctrl+Z): ");

        Scanner s = new Scanner(System.in);
        String testo = "";
        String nuovo_testo = "";

        while(s.hasNext()){
            testo += s.nextLine() +"\n";
        }
        s.close();

        for (int i = 0; i < testo.length(); i++) {
            switch (testo.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    nuovo_testo += testo.charAt(i) +"f"+testo.charAt(i);
                    break;
                case 'A', 'E', 'I', 'O', 'U':
                    nuovo_testo += testo.charAt(i) +"f"+testo.charAt(i);
                    break;
                default:
                    nuovo_testo += testo.charAt(i);
                    break;
            }
        }

        System.out.println(nuovo_testo);
    }
}
