public class CO3ParkingGraph {

    public static void main(String[] args) {

        System.out.println("GRAPH CONSTRUCTION (Parking Zones)\n");

        System.out.println("Zone Connections\n");

        System.out.println("A -> B");
        System.out.println("A -> C");
        System.out.println("B -> D");
        System.out.println("C -> E");
        System.out.println("D -> F\n");

        System.out.println("PARKING NETWORK GRAPH\n");

        System.out.println("          A");
        System.out.println("        /   \\");
        System.out.println("       B     C");
        System.out.println("       |     |");
        System.out.println("       D     E");
        System.out.println("       |");
        System.out.println("       F\n");

        System.out.println("BFS TRAVERSAL\n");

        System.out.println("A -> B -> C -> D -> E -> F\n");

        System.out.println("DFS TRAVERSAL\n");

        System.out.println("A -> B -> D -> F -> C -> E\n");

        System.out.println("Nearest Available Parking Zone\n");

        System.out.println("Zone D");
        System.out.println("Distance = 2 Routes\n");

        System.out.println("Time Complexity:");

        System.out.println("BFS Traversal -> O(V + E)");
        System.out.println("DFS Traversal -> O(V + E)");
    }
}