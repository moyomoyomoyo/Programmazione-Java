public class Mesi {
    
    public static void main(String[] args) {
        String mese = args[0];

        switch (mese) {
            case "febbraio":
                System.out.println("Il numero di giorni di " + mese + "  e' 28");
                break;
        
            case "novembre", "aprile", "giugno", "settembre":
                System.out.println("Il numero di giorni di " + mese + "  e' 30");
                break;
            
            case "gennaio", "marzo", "maggio", "luglio", "agosto", "ottobre", "dicembre":
                System.out.println("Il numero di giorni di " + mese + "  e' 31");
                break;
            default:
                System.out.println("Il nome del mese non e' corretto");
                break;
        }
    }
}
