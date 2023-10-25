import java.util.Scanner;

public class Inverso {
    public static void main(String[] args) {
        
        System.out.println("Inserisci un testo (per terminare ctrl+Z+enter): ");
        Scanner s = new Scanner(System.in);

        String testo = "";

        while(s.hasNext()){
            testo += s.nextLine() +"\n";
        }
        s.close();

        System.out.print("\nTesto invertito:");
        for (int i = testo.length()-1; i >= 0; i--) {
            System.out.print(testo.charAt(i));
        }
    }
}
