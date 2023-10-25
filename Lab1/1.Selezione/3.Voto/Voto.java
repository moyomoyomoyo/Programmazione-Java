public class Voto {
    public static void main(String[] args) {
        Integer v = Integer.parseInt(args[0]);

        if (v < 0 || v > 100)
            System.out.println("Errore");
        else if (v >= 0 && v<60)
            System.out.println("Insufficiente");
        else if(v<70)
            System.out.println("Sufficiente");
        else if(v<80)
            System.out.println("Buono");
        else if(v<90)
            System.out.println("Distinto");
        else
            System.out.println("Ottimo");
        
    }
}
