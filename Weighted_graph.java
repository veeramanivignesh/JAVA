import java.util.*;

public class Weighted_graph {
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
                System.err.println(li.get(i).get(j)[0]+"("+li.get(i).get(j)[i]+")");
            }
        }
    }
    
}