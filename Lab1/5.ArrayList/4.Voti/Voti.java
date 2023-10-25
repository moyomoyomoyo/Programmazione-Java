import java.util.ArrayList;
import java.util.Scanner;

public class Voti {

    public static void main(String[] args) {
        System.out.println("Inserisci i voti: ");
        ArrayList<Integer> numeri = leggiNumeri(args);

        filtraVoti(numeri);

    }

    public static ArrayList<Integer> leggiNumeri(String[] args){
        // REQUIRES: String[] args
        // EFFECTS: restituisce ArrayList<Integer> con i numeri interi letti da standard input
        ArrayList<Integer> numeri = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        
        while (s.hasNextLine()) {
            numeri.add(Integer.parseInt(s.nextLine()));
        }
        numeri.removeIf(n -> (n < 0 || n> 100));
        s.close();
        return numeri;
    }
    
    public static void filtraVoti(ArrayList<Integer> l){
        // REQUIRES: ArrayList<Integer>
        // EFFECTS: stampa le sottosequenze dei voti meorizzati in <l> sufficienti e insufficienti
        ArrayList<Integer> suff = new ArrayList<>();
        ArrayList<Integer> insuff = new ArrayList<>();

        for (Integer voto : l) {
            if(voto >= 60)
                suff.add(voto);
            else    
                insuff.add(voto);
        }

        System.out.println("Voti sufficienti: " + suff);
        System.out.println("Voti insufficienti: " + insuff);
    }

}
