public class Radice {

    public static void main(String[] args) {
        Double n = Double.parseDouble(args[0]);

        if(n > 0){
            System.out.println("Radice quadrata: " + radiceQuadrata(n));
        } else 
            System.out.println("Il valore inserito non appartiene al dominio della funzione");
    }

    public static double radiceQuadrata(double numero){
        // REQUIRES: double numero
        // EFFECTS: restituisce la radice quadrata di <numero> se <numero> è <= 0 restituisce 0
        if(numero > 0){
            return Math.sqrt(numero);
        }
        return 0;
    }
}
