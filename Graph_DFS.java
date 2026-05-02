import java.util.*;

public class Graph_DFS {

    public static void DFS(int start, boolean[] visited, List<List<Integer>> li) {
        visited[start] = true;
        System.out.print(start + " ");   // changed from System.err to System.out

        for (int i : li.get(start)) {
            if (!visited[i]) {
                DFS(i, visited, li);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vertex = input.nextInt();
        List<List<Integer>> li = new ArrayList<>();

        for (int i = 0; i < vertex; i++) {
            li.add(new ArrayList<>());
        }

        int edge = input.nextInt();

        for (int i = 0; i < edge; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            li.get(a).add(b);        // Directed graph
            // li.get(b).add(a);     // Uncomment for Undirected graph
        }

        boolean[] visited = new boolean[vertex];

        System.out.println("DFS Traversal:");
        DFS(0, visited, li);
    }
}
