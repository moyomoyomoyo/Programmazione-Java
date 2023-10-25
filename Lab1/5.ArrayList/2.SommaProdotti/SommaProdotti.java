public class SommaProdotti {

    public static void main(String[] args) {
        
        int[]  numeri= new int [args.length];

        if (args.length %2 == 0){
            for (int i = 0; i < args.length; i++) {
                numeri[i] = Integer.parseInt(args[i]);
            }
            System.out.println("La somma e' " + calcola(numeri));

        } else  
            System.out.println("Non e' stata inserita una lunghezza pari di interi");
        
    }

    public static int calcola(int[] n){
        // REQUIRES: int[] n 
        // EFFECTS: restituisce la somma dei prodotti ottenuti moltiplicando ciascun numero 
        //          in posizione pari per il successivo in posizione dispari
        int somma = 0;
        for (int i = 0; i < n.length; i+=2) {
            somma += n[i] * n[i+1];
        }
        return somma;
    }
}
