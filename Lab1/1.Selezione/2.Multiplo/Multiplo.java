public class Multiplo {

    public static void main(String[] args) {
        Integer num1 = Integer.parseInt(args[0]);
        Integer num2 = Integer.parseInt(args[1]);

        if (num1%num2 == 0) {
            System.out.println(num1 + " e' multiplo di " + num2);
        } else {
            System.out.println(num1 + " non e' multiplo di " + num2);
        }
    }
}
