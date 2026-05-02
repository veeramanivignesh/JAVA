import java.util.*;
public class Graph_BFS_DFS {
    public static void BSF(int start,int vertex,List<List<Integer>> li){

        boolean[] visited = new boolean[vertex];
        Deque<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int temp=q.poll();
            System.out.print(temp+" ");

            for(int i:li.get(temp)){
                if(visited[i]==false){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
    public static void DFS(int start,boolean[] visited,List<List<Integer>> li){
        visited[start]=true;
        System.err.print(start+" ");

        for(int i:li.get(start)){
            if(visited[i]==false){
                DFS(i,visited,li);
            }
        }
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int vertex=input.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<vertex;i++){
            li.add(new ArrayList<>());
        }
        int edge=input.nextInt();
        for(int i=0;i<edge;i++){
            
            int a=input.nextInt();
            int b =input.nextInt();

            li.get(a).add(b);
            //li.get(b).add(a);
        }
         for(int i=0;i<vertex;i++){
            System.out.print(i+"-> ");
            for(int j=0;j<li.get(i).size();j++){
                System.out.print(li.get(i).get(j)+" ");
            }
            System.out.println("");
        }
        System.out.println("BFS ");
        BSF(0,vertex,li);
        System.out.println("");
        boolean visited[] = new boolean[vertex];
        System.out.println("DFS");
        DFS(0,visited,li);

    }
    
}