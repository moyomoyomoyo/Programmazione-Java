import java.util.ArrayList;

public class TavolaPitagorica {
    public static void main(String[] args) {

        Integer n = Integer.parseInt(args[0]);
        stampaTavolaPitagorica(creaTavolaPitagorica(n));
    
    }

    public static ArrayList<ArrayList<Integer>>  creaTavolaPitagorica(int n){
        // REQUIRES: int n
        // EFFECTS: restituisce la tavola periodica di <n>
        ArrayList<ArrayList<Integer>> s = new ArrayList<ArrayList<Integer>>(n);
        for (int r = 0; r < n; r++) {
            s.add(r, new ArrayList<Integer>());
            for (int c = 0; c < n; c++) {
                s.get(r).add((r+1)*(c+1));
            }
        }
        return s;
    }
    
    public static void stampaTavolaPitagorica(ArrayList<ArrayList<Integer>>  s){
        // REQUIRES: ArrayList<ArrayList<Integer>> s
        // EFFECTS: stampa la tavola periodica <s>
        for (int r = 0; r < s.size(); r++) {
            for (int c = 0; c < s.size(); c++) {
                System.out.print(s.get(r).get(c) + "\t");
            }
            System.out.println();
        }
    }
}
