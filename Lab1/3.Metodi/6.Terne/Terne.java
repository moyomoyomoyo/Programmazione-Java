public class Terne {

    

    public static void main(String[] args) {
        Integer soglia = Integer.parseInt(args[0]);

        if(soglia > 0){
            ternePitagoriche(soglia);
        } else
            System.out.println("La soglia inserita non è positiva");
    }
    
    public static boolean ternaPitagorica(int a, int b, int c){
        // REQUIRES: int a, int b, int c
        // EFFECTS: se <a>, <b>, <c> formano una terna pitagorica viene restituito true, false altrimenti
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
            return true;

        return false;
    }

    public static void ternePitagoriche(int soglia){
        // REQUIRES: int soglia
        // EFFECTS: stampa tutte le terne pitagoriche inferiori a <soglia>
        for (int i = 0; i < soglia; i++) {
            for (int j = i+1; j < soglia; j++) {
                for (int k = j+1; k < soglia; k++) {
                    if(ternaPitagorica(i, j, k))
                        System.out.println("("+i +", " + j +", " + k+")");
                }
            }
        }
    }
}
