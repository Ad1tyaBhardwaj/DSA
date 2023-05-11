import java.util.ArrayList;

public class graph3 {
    public static void addEdge(ArrayList<ArrayList<Integer>> alt, int u, int v){
        alt.get(u).add(v);
        alt.get(v).add(u);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> alt){
        for(int i=0;i<alt.size();i++){
            System.out.print(alt.get(i));
        }
    }

    public static void main(String[] args) {

    }
}
