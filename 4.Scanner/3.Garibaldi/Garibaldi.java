import java.util.Scanner;

public class Garibaldi {
    
    public static void main(String[] args) {
        
        System.out.println("Inserisci un testo (per terminare ctrl+Z+enter): ");
        Scanner s = new Scanner(System.in);

        String testo = "";

        while(s.hasNext()){
            testo += s.nextLine() +"\n";
        }
        s.close();

        // rimpiazzo prima tutte le a, poi tutte le e, poi le i e infine le o
        testo = testo.replace('a', 'u');
        testo = testo.replace('e', 'u');
        testo = testo.replace('i', 'u');
        testo = testo.replace('o', 'u');

        System.out.println("Risultato trasformazione: ");
        System.out.println(testo);
    }
}
