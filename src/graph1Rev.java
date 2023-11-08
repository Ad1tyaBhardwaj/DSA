import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graph1Rev {

    static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
        System.out.println("Graph Made");
    }

    public static void PrintingNeighbours(int num, ArrayList<Edge> graph[]){
        for(int i=0;i<graph[num].size();i++){
            Edge currEdge = graph[num].get(i);
            System.out.print(currEdge.dest+" ");
        }
    }

    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i =0; i<graph[curr].size();i++){
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph,e.dest,vis);
            }
        }
    }

    //Printing all paths from Source to Target:
    public static void printAllPaths(ArrayList<Edge> graph[], int curr, boolean vis[], int target, String path){
        if(curr == target){
            System.out.println(path);
            return;
        }
        for(int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                vis[curr] = true;
                printAllPaths(graph,e.dest,vis,target,path+e.dest);
                vis[curr] = false;
            }
        }
    }



    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        boolean vis2[] = new boolean[V];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        //print neighbours
        PrintingNeighbours(num,graph);
        System.out.println();
        bfs(graph);
        System.out.println();
        dfs(graph,0,vis);
        System.out.println();
        System.out.println("Print all Paths");
        printAllPaths(graph,0,vis2,5," ");
    }

}