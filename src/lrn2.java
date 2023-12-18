import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class lrn2 {

    public static void bfs(int[][] flights, int src){
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        for(int[] flight : flights){
            int a = flight[0], b = flight[1];
            adj.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
            adj.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
//            adj.computeIfAbsent(flight[0], val -> new ArrayList<Integer>()).add(flight[1]);
        }
        //successfully created a HashMap :)
        System.out.println(adj);
        //System.out.println(adj);
        boolean[] vis = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);

        while (!q.isEmpty()){
            int temp = q.poll();
            if(vis[temp] == false){
                System.out.print(temp+ " ");
                vis[temp] = true;
                for(int i=0;i<adj.get(temp).size();i++){
                    q.offer(adj.get(temp).get(i));
                }
            }
        }
    }

    public static void bfs1(int[][] edges, int src, int dest){
        HashMap<Integer,ArrayList<Integer>> adj = new HashMap<>();
        for(int[] edge : edges){
            int a = edge[0], b=edge[1];
            adj.computeIfAbsent(edge[0],val -> new ArrayList<>()).add(b);
            adj.computeIfAbsent(edge[1],val -> new ArrayList<>()).add(a);
        }
        System.out.println(adj);
        boolean[] vis = new boolean[6];
        Queue<ArrayList<Integer>> sol = new LinkedList<>();
        ArrayList<Integer> strt = new ArrayList<>();
        strt.add(src);
        sol.offer(strt);
//      System.out.println(strt);
        while(!sol.isEmpty()){
            ArrayList<Integer> parent = sol.poll();
            int pLast = parent.get(parent.size()-1);
            for(int i=0;i<adj.get(pLast).size();i++){
                ArrayList<Integer> f2 = new ArrayList<>();
                //Copy previous Array
                for(int j=0;j<parent.size();j++){
                    f2.add(parent.get(j));
                }
                //adding new element if not visited
                if(!vis[adj.get(pLast).get(i)]){
                    f2.add(adj.get(pLast).get(i));
                }
                sol.offer(f2);
                System.out.println(f2);
            }
            vis[pLast] = true;
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[7][2];
        arr[0] = new int[] {0,1};
        arr[1] = new int[] {0,2};
        arr[2] = new int[] {1,3};
        arr[3] = new int[] {3,4};
        arr[4] = new int[] {2,4};
        arr[5] = new int[] {4,5};
        arr[6] = new int[] {3,5};

        int[][] arr2 = new int[8][2];
        arr2[0] = new int[] {0,1};
        arr2[1] = new int[] {0,2};
        arr2[2] = new int[] {0,3};
        arr2[3] = new int[] {1,4};
        arr2[4] = new int[] {2,4};
        arr2[5] = new int[] {3,4};
        arr2[6] = new int[] {3,5};
        arr2[7] = new int[] {4,5};
        //bfs(arr,0);
        bfs1(arr2,0,5);
    }
}
