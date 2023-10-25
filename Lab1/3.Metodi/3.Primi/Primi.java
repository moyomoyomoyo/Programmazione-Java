public class Primi {

    public static void main(String[] args) {
        Integer soglia = Integer.parseInt(args[0]);

        if(soglia > 0){
            numeriPrimi(soglia);
        } else 
            System.out.println("La soglia inserita non e' positiva");

    }

    public static boolean primo(int n){
        // REQUIRES: int n
        // EFFECTS: restituisce true se <n> è numero primo, false altrimenti
        for (int i = 2; i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void numeriPrimi(int limite){
        // REQUIRES: int n
        // EFFECTS: stampa numeri primi inferiori a <limite>
        for (int i = 2; i < limite; i++) {
            if(primo(i))
                System.out.print(i + " ");
        }
    }
    
}
