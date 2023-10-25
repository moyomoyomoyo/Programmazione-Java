import java.util.ArrayList;

public class Medie {
    public static void main(String[] args) {
        
        ArrayList <Double> numeri = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if(Double.parseDouble(args[i]) > 0)
                numeri.add(Double.parseDouble(args[i]));
        } 

        double somma = 0;
        for (Double num : numeri) {
            somma += num;
        }

        System.out.println("Media aritmetica: " + somma/numeri.size());
    }
}
