public class SommaIntervallo {
    public static void main(String[] args) {
        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);

        int somma = 0;
        for (int i = a; i < b; i++) {
            if (i%2 == 0) {
                somma += i;
            }
        }

        System.out.println("Somma = " + somma);
    }
}
