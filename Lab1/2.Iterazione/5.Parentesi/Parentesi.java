public class Parentesi {
    public static void main(String[] args) {
        String parentesi = args[0];
        int bilancio = 0;

        for (int i = 0; i < parentesi.length(); i++) {
            if(parentesi.charAt(i) == '[')
                bilancio++;
            else 
                bilancio--;
        }

        if(bilancio != 0)
            System.out.println("Non bilanciate");
        else 
            System.out.println("Bilanciate");
    }
}
