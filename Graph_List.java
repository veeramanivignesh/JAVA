import java.util.*;
public class Graph_List {
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
            li.get(b).add(a);
        }

        for(int i=0;i<vertex;i++){
            System.out.println(i+"->");
            for(int j=0;j<li.get(i).size();j++){
                System.out.print(li.get(i).get(j)+" ");
            }
            System.out.println("");
        }

        input.close();
    }
}