import java.util.Scanner;

public class MinMaxAvg {
    
    public static void main(String[] args) {
        Integer n = Integer.parseInt(args[0]);
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci " + n + " numeri:");

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
        }

        System.out.println("Minimo: " + minimo(numbers));
        System.out.println("Massimo: " + massimo(numbers));
        System.out.println("Valore medio: " + media(numbers));
        s.close();

    }

    public static int minimo(int[] in){
        // REQUIRES: int[] in
        // EFFECTS: restituisce il valore minimo in <in>
        int min = in[0];
        for (int i : in) {
            if(i < min)
                min = i;
        }
        return min;
    }

    public static int massimo(int[] in){
        // REQUIRES: int[] in
        // EFFECTS: restituisce il valore massimo in <in>
        int max = in[0];
        for (int i : in) {
            if(i > max)
                max = i;
        }
        return max;
    }

    public static float media(int[] in){
        // REQUIRES: int[] in
        // EFFECTS: restituisce la media dei valori in <in>
        float somma = 0;
        for (int i : in) {
            somma += i;
        }
        return somma/in.length;
    }
}
