public class Perfetti {
    
    public static void main(String[] args) {
        Integer n = Integer.parseInt(args[0]);
        if(perfetto(n))
            System.out.println(n + " e' perfetto");
        else
            System.out.println(n + " non e' perfetto");
    }

    public static int sommaDivisoriPropri(int n){
        // REQUIRES: int n
        // EFFECTS: restituisce la somma dei divisori propri di <n>
        int somma = 0;
        for (int i = 1; i < n; i++) {
            if(n%i == 0)
                somma += i;
        }
        return somma;
    }

    public static boolean perfetto(int n){
        // REQUIRES: int n
        // EFFECTS: restituisce true se il <n> è un numero perfetto false altrimenti
        if(sommaDivisoriPropri(n) == n && n > 0)
            return true;

        return false;
    }

}
