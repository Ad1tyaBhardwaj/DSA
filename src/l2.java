import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class l2 {

    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[], int V){
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    static class pair implements Comparable<pair>{
        int Node;
        int dist;
        pair(int Node, int dist){
            this.Node = Node;
            this.dist = dist;
        }

        @Override
        public int compareTo(pair p2){
            return this.dist - p2.dist;
        }

    }

    public static void dijkstra(ArrayList<Edge> graph[], int src, int V){
        int dist[] = new int[V];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        pq.add(new pair(0,0));

        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.Node]){
                vis[curr.Node] = true;
                for(int i=0;i<graph[curr.Node].size();i++){
                    Edge e = graph[curr.Node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u]+e.wt < dist[v]){
                        dist[v] = dist[u]+e.wt;
                        pq.add(new pair(v,e.wt));
                    }
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph,V);
        dijkstra(graph,0,V);

    }
}