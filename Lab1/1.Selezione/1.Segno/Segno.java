public class Segno {
    public static void main(String[] args) {
        Integer n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println(n);
        }else{
            System.out.println("+" + n);
        }
    }
}