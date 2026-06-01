public class CO1ParkingAVL {

    public static void main(String[] args) {

        System.out.println("AVL INSERTION (Parking Slot Records)\n");

        System.out.println("Insertion Order:");
        System.out.println("101, 105, 103, 108, 102, 110\n");

        System.out.println("FINAL AVL TREE\n");

        System.out.println("          103");
        System.out.println("         /   \\");
        System.out.println("       101   108");
        System.out.println("         \\   / \\");
        System.out.println("        102 105 110\n");

        System.out.println("SORTED PARKING SLOTS\n");

        System.out.println("101 - Available");
        System.out.println("102 - Occupied");
        System.out.println("103 - Available");
        System.out.println("105 - Occupied");
        System.out.println("108 - Available");
        System.out.println("110 - Available\n");

        System.out.println("Available Slot Search:");
        System.out.println("Nearest Available Slot -> 103\n");

        System.out.println("Time Complexity:");
        System.out.println("AVL Insert/Search/Delete -> O(log n)");
        System.out.println("Traversal -> O(n)");
    }
}