import java.util.Scanner;

public class Cesare {
    
    public static void main(String[] args) {
        Integer k = Integer.parseInt(args[0]);
        
        String testo = leggiTesto();
        System.out.print("\nTesto cifrato:\n");
        System.out.println(CifraTesto(testo, k));

    }

    public static String leggiTesto(){
        // EFFECTS: restituisce il testo letto da standard input
        System.out.println("Inserisci un testo (per terminare ctrl+Z+enter): ");
        Scanner s = new Scanner(System.in);

        String testo = "";
        while(s.hasNext()){
            testo += s.nextLine() +"\n";
        }
        s.close();
        return testo;
    }

    public static char cifraCarattere(char c, int chiave){
        // REQUIRES: char c, int chiave
        // EFFECTS: restituisce la lettera <c> cifrata secondo <chiave>
        String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String beto = alfa.toLowerCase();

        if(Character.isLowerCase(c)){
            for (int i = 0; i < beto.length(); i++) {
                if(c == beto.charAt(i)){

                    if(i + chiave < 0)
                        return beto.charAt(beto.length()+chiave);
                    else 
                        return beto.charAt(i+chiave);
                }
            }
        } 

        for (int i = 0; i < alfa.length(); i++) {
            if(c == alfa.charAt(i)){
                if(i + chiave < 0)
                    return alfa.charAt(alfa.length()+chiave);
                else 
                    return alfa.charAt(i+chiave);
            }
        }

        return c;
    }

    public static String CifraTesto(String s, int chiave){
        // REQUIRES: String s, int chiave
        // EFFECTS: restituisce <s> cifrata secondo <chiave>
        String cifratura = "";

        for (int i = 0; i < s.length(); i++) {
            cifratura += cifraCarattere(s.charAt(i), chiave);
        }
        return cifratura;
    }
}
