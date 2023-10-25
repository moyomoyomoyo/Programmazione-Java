import java.util.ArrayList;

public class SommaUnici {

    public static void main(String[] args) {

        ArrayList<Integer> numeri = leggiNumeri(args);
        int somma = 0;
        for (Integer num : numeri) {
            if(occorrenze(numeri, num) == 1)
                somma += num;
        }
        System.out.println(somma);
    }

    public static ArrayList<Integer> leggiNumeri(String[] args){
        // REQUIRES: String[] args
        // EFFECTS: restituisce ArrayList<Integer> con i numeri interi letti da standrd input
        ArrayList<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            try {
                numeri.add(Integer.parseInt(args[i]));
            } catch (Exception e) {
                // i caratteri che non vengono riconosciuti come numeri vengono ignorati
            }
        }

        return numeri;
    }

    public static int occorrenze(ArrayList<Integer> numeri, int n){
        // REQUIRES: ArrayList<Integer> numeri, int n
        // EFFECTS: restituisce le occorrenze di <n> in <numeri>
        int occ = 0;
        for (int i = 0; i < numeri.size(); i++) {
            if(numeri.get(i) == n)
                occ++;
        }
        return occ;
    }
}
