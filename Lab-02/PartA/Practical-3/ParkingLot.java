

public class ParkingLot {
    private int twoWheelers  = 0;
    private int fourWheelers = 0;
    private final int twoCap;
    private final int fourCap;
    private static long revenue = 0;

    public ParkingLot(int twoCap, int fourCap) {
        this.twoCap  = twoCap;
        this.fourCap = fourCap;
    }

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

    public void leave(String type) {
        if (type.equals("two")  && twoWheelers  > 0) twoWheelers--;
        else if (type.equals("four") && fourWheelers > 0) fourWheelers--;
    }

    public int getTwoWheelers()  { return twoWheelers; }
    public int getFourWheelers() { return fourWheelers; }
    public static long getRevenue() { return revenue; }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(2, 1);

        lot.park("two");
        lot.park("two");
        lot.park("two");
        lot.park("four");
        lot.park("four");
        lot.leave("two");
        lot.park("two");

        System.out.println("Two-wheelers parked: " + lot.getTwoWheelers());
        System.out.println("Four-wheelers parked: " + lot.getFourWheelers());
        System.out.println("Revenue: " + ParkingLot.getRevenue());
    }
}
