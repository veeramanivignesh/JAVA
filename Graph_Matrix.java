import java.util.*;
public class Graph_Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vertex=input.nextInt();
        int edge = input.nextInt();
        int [][] graph=new int[vertex+1][vertex+1];
        
        for(int i=0;i<edge;i++){

            int a=input.nextInt();
            int b=input.nextInt();

            graph[a][b]=1;
            graph[b][a]=1;
        }

        for(int i=0;i<vertex+1;i++){
            System.out.print(i+":");
            for(int j=0;j<vertex+1;j++){
                if(graph[i][j]==1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    
}