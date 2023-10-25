import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxAvg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci i numeri: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (s.hasNext()) {
            numbers.add(s.nextInt());  
        }

        System.out.println("Minimo: " + minimo(numbers));
        System.out.println("Massimo: " + massimo(numbers));
        System.out.println("Valore medio: " + media(numbers));
        s.close();
    }
    
    public static int minimo(ArrayList<Integer> in){
        // REQUIRES: ArrayList<Integer> in
        // EFFECTS: restituisce il valore minimo presente in <in>
        int min = in.get(0);
        for (int i : in) {
            if(i < min)
                min = i;
        }
        return min;
    }

    public static int massimo(ArrayList<Integer> in){
        // REQUIRES: ArrayList<Integer> in
        // EFFECTS: restituisce il valore massimo presente in <in>
        int max = in.get(0);
        for (int i : in) {
            if(i > max)
                max = i;
        }
        return max;
    }

    public static float media(ArrayList<Integer> in){
        // REQUIRES: ArrayList<Integer> in
        // EFFECTS: restituisce la media dei valori presenti in <in>
        float somma = 0;
        for (int i : in) {
            somma += i;
        }
        return somma/in.size();
    }
}
