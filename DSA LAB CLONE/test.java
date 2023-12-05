import java.util.*;

class PrimAlgorithm {
    private static final int V = 5; // Number of vertices in the graph

    // Utility function to find the vertex with the minimum key value
    int minKey(int key[], boolean mstSet[]) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Function to print the constructed MST stored in parent[]
    void printMST(int parent[], int graph[][]) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    // Function to construct and print MST for a graph represented using adjacency
    // matrix representation
    void primMST(int graph[][]) {
        int parent[] = new int[V]; // Array to store constructed MST
        int key[] = new int[V]; // Key values used to pick minimum weight edge in cut
        boolean mstSet[] = new boolean[V]; // To represent set of vertices included in MST

        // Initialize all keys as INFINITE
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        // Always include the first vertex in MST
        key[0] = 0; // Make key 0 so that this vertex is picked as the first vertex
        parent[0] = -1; // First node is always root of MST

        // The MST will have V vertices
        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet); // Pick the minimum key vertex from the set of vertices not yet included in MST
            mstSet[u] = true; // Add the picked vertex to the MST set

            // Update key value and parent index of the adjacent vertices of the picked
            // vertex
            for (int v = 0; v < V; v++) {
                // graph[u][v] is non-zero only for adjacent vertices of m
                // mstSet[v] is false for vertices not yet included in MST
                // Update the key only if the graph[u][v] is smaller than key[v]
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        // Print the constructed MST
        printMST(parent, graph);
    }

    public static void main(String[] args) {
        PrimAlgorithm prim = new PrimAlgorithm();
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        // Print the minimum spanning tree
        prim.primMST(graph);
    }
}
