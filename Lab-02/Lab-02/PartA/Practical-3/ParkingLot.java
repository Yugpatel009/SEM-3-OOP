/**
 * Practical 3 (Part A, For Advanced Learners) - Parking Lot
 * Concepts: encapsulation with several rules to keep valid, a static running
 * revenue total, and rejecting invalid operations.
 */
public class ParkingLot {
    private int twoWheelers  = 0;           // currently parked
    private int fourWheelers = 0;
    private final int twoCap;               // capacities (fixed)
    private final int fourCap;
    private static long revenue = 0;        // earned across all lots

    public ParkingLot(int twoCap, int fourCap) {
        this.twoCap  = twoCap;
        this.fourCap = fourCap;
    }

    /** Park a vehicle if there is room; otherwise reject. Fee: two=20, four=40. */
    public void park(String type) {
        if (type.equals("two")) {
            if (twoWheelers < twoCap)  { twoWheelers++;  revenue += 20; System.out.println("  parked two-wheeler"); }
            else System.out.println("  two-wheeler section FULL");
        } else if (type.equals("four")) {
            if (fourWheelers < fourCap){ fourWheelers++; revenue += 40; System.out.println("  parked four-wheeler"); }
            else System.out.println("  four-wheeler section FULL");
        } else {
            System.out.println("  unknown type: " + type);
        }
    }

    /** A vehicle leaves; never let a count fall below zero. */
    public void leave(String type) {
        if (type.equals("two")  && twoWheelers  > 0) twoWheelers--;
        else if (type.equals("four") && fourWheelers > 0) fourWheelers--;
    }

    public int getTwoWheelers()  { return twoWheelers; }
    public int getFourWheelers() { return fourWheelers; }
    public static long getRevenue() { return revenue; }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(2, 1);   // tiny lot so we can hit "FULL"

        lot.park("two");    // ok
        lot.park("two");    // ok (two-wheeler section now full)
        lot.park("two");    // FULL -> rejected
        lot.park("four");   // ok (four-wheeler section now full)
        lot.park("four");   // FULL -> rejected
        lot.leave("two");   // frees one two-wheeler slot
        lot.park("two");    // ok again

        System.out.println("Two-wheelers parked: " + lot.getTwoWheelers());   // 2
        System.out.println("Four-wheelers parked: " + lot.getFourWheelers()); // 1
        System.out.println("Revenue: " + ParkingLot.getRevenue());            // 100
    }
}
