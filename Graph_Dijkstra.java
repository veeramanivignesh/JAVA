import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Graph_Dijkstra {
    static int [] Dijkstra(int start,int v,List<List<int []>> li){
        int [] distance=new int[v];
        for(int i=0;i<v;i++){
            distance[i]=Integer.MAX_VALUE;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]-b[1]));
        distance[start]=0;
        pq.add(new int []{start,0});
        while(!pq.isEmpty()){
            int [] curr = pq.poll();
            int vertex=curr[0];
            int dis=curr[1];
            for(int [] i:li.get(vertex)){
                int neighbor=i[0];
                int weight=i[1];
                if(dis+weight<distance[neighbor]){
                    distance[neighbor]=dis+weight;
                    pq.add(new int[]{neighbor,distance[neighbor]});
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<int []>> li = new ArrayList<>();

        int vertex=input.nextInt();
        for(int i=0;i<vertex;i++){
            li.add(new ArrayList<>());
        }
        int edge = input.nextInt();

        for(int i=0;i<edge;i++){
            int a =input.nextInt();
            int b=input.nextInt();
            int w =input.nextInt();
            li.get(a).add(new int []{b,w});
        }
        for(int i=0;i<vertex;i++){
            System.out.print(i+"->");
            for(int j=0;j<li.get(i).size();j++){
                System.err.print(li.get(i).get(j)[0]+"("+li.get(i).get(j)[1]+") ");
            }
        }

        int [] res =Dijkstra(0,vertex,li);
        System.out.println(Arrays.toString(res));
    }
}