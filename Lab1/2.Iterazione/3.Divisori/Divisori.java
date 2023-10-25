public class Divisori {
    public static void main(String[] args) {
        Integer n = Integer.parseInt(args[0]);

        System.out.print("Divisori propri di " + n + ": ");
        for (int i = 1; i < n; i++) {
            if (n%i == 0) {
                System.out.print(i + " ");
            }
            
        }
    }
}
