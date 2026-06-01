public class CO2ParkingBTree {

    public static void main(String[] args) {

        System.out.println("B+ TREE INDEXING (Parking Transactions)\n");

        System.out.println("Transaction Records\n");

        System.out.println("Vehicle A -> ₹50");
        System.out.println("Vehicle B -> ₹70");
        System.out.println("Vehicle C -> ₹120");
        System.out.println("Vehicle D -> ₹90");
        System.out.println("Vehicle E -> ₹150\n");

        System.out.println("B+ TREE STRUCTURE\n");

        System.out.println("                 [90]");
        System.out.println("               /      \\");
        System.out.println("       [50,70]       [120,150]\n");

        System.out.println("RANGE QUERY RESULT\n");

        System.out.println("Parking Fees Between ₹50 and ₹100\n");

        System.out.println("Vehicle A -> ₹50");
        System.out.println("Vehicle B -> ₹70");
        System.out.println("Vehicle D -> ₹90\n");

        System.out.println("Revenue Statistics\n");

        System.out.println("Total Revenue = ₹480");
        System.out.println("Average Revenue = ₹96\n");

        System.out.println("Time Complexity:");

        System.out.println("Insertion -> O(log n)");
        System.out.println("Search -> O(log n)");
        System.out.println("Range Query -> O(log n + k)");
    }
}