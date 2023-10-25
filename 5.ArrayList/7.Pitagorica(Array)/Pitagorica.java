public class Pitagorica {
    public static void main(String[] args) {
        Integer n = Integer.parseInt(args[0]);
        stampaTavolaPitagorica(creaTavolaPitagorica(n));
    }

    public static int[][] creaTavolaPitagorica(int n){
        // REQUIRES: int n
        // EFFECTS: restituisce la tavola periodica di <n>
        int[][] s = new int[n][n];
        for (int r = 0; r < s.length; r++) {
            for (int c = 0; c < s.length; c++) {
                s[r][c] = (r+1)*(c+1);
            }
        }

        return s;
    }

    public static void stampaTavolaPitagorica(int[][] s){
        // REQUIRES: int[][] s
        // EFFECTS: stampa la tavola periodica <s>
        for (int r = 0; r < s.length; r++) {
            for (int c = 0; c < s.length; c++) {
                System.out.print(s[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
