import java.util.*;

public class tempo {

    public static void printMap(Map<Integer, List<int[]>> adj){
        for(int i : adj.keySet()){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //To store the adjency list
        int[][] flights = new int[5][3];
        flights[0] = new int[] {0,1,100};
        flights[1] = new int[] {1,2,100};
        flights[2] = new int[] {2,0,100};
        flights[3] = new int[] {1,3,600};
        flights[4] = new int[] {2,3,200};

        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] i : flights){
            adj.computeIfAbsent(i[0], value -> new ArrayList<>()).add(new int[] { i[1], i[2] });
        }



        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print(flights[i][j]+" ");
            }
            System.out.println();
        }

    }

}