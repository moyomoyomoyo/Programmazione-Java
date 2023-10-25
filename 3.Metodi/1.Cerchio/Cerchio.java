public class Cerchio {

    public static void main(String[] args) {
        Double raggio = Double.parseDouble(args[0]);

        System.out.println("Area del cerchio: " + CalcolaArea(raggio));
        System.out.println("Circonferenza del cerchio: " + CalcolaCirconferenza(raggio));
    }

    public static double CalcolaArea(double raggio) {
        // REQUIRES: double raggio
        // EFFECTS: dato <raggio> viene restituita l'area del suo cerchio 
        return Math.pow(raggio, 2)*Math.PI;  
    }

    public static double CalcolaCirconferenza(double raggio) {
        // REQUIRES: double raggio
        // EFFECTS: dato <raggio> viene restituita la circonferenza del suo cerchio 
        return 2 * raggio * Math.PI;
    }
}