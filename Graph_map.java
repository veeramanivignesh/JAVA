import java.util.*;
public class Graph_map {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer,List<Integer>> map = new HashMap<>();
        int vertex = input.nextInt();
        int edge = input.nextInt();

        System.out.println("Enter Vertex");
        for(int i=0;i<vertex;i++){
            int val=input.nextInt();
            map.put(val,new ArrayList<>());
        }
        System.out.println("Enter the Source / Destination");

        for(int i=0;i<edge;i++){
            int a=input.nextInt();
            int b = input.nextInt();

            if(map.containsKey(a) && map.containsKey(b)){
                map.get(a).add(b);
            }
        }
        for(int i:map.keySet()){
            System.out.print(i+": ");
            for(int val:map.get(i)){
                System.out.print(val);
            }
            System.err.println("");
        }
        
    }
    
}