public class Palindroma {
    public static void main(String[] args) {
        String s = args[0];
        boolean flag = false;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) == s.charAt(s.length()-1-i)){
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Palindroma");
        else
            System.out.println("Non palindroma");

        
    }
}
