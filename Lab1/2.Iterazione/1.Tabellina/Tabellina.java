public class Tabellina {
    public static void main(String[] args) {
        Integer n = Integer.parseInt(args[0]);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + i*n);
        }
    }
}
