package p2;

public class Thermostat {
    private String location;
    private int temperature;
    private static final int MIN = 16;
    private static final int MAX = 30;
    private static int activeCount = 0;

    // (b) Constructor(location, startTemp)
    public Thermostat(String location, int startTemp) {
        this.location = location;
        if (startTemp >= MIN && startTemp <= MAX) {
            this.temperature = startTemp;
        } else {
            this.temperature = 22;
        }
        activeCount++;
    }

    // (c) Constructor(location)
    public Thermostat(String location) {
        this(location, 22);
    }

    // (d) raise(): if temperature < MAX add 1, else print "Already at maximum (30)"
    public void raise() {
        if (this.temperature < MAX) {
            this.temperature++;
        } else {
            System.out.println("Already at maximum (30)");
        }
    }

    // (e) lower(): if temperature > MIN subtract 1, else print "Already at minimum (16)"
    public void lower() {
        if (this.temperature > MIN) {
            this.temperature--;
        } else {
            System.out.println("Already at minimum (16)");
        }
    }

    // (f) Add getTemperature() (no setter) and static getActiveCount()
    public int getTemperature() {
        return this.temperature;
    }

    public String getLocation() {
        return this.location;
    }

    public static int getActiveCount() {
        return activeCount;
    }

    // (g) In main: create two thermostats, call raise() 10 times then lower() 20 times in loops
    public static void main(String[] args) {
        // Create two thermostats
        Thermostat t1 = new Thermostat("LivingRoom", 25);
        Thermostat t2 = new Thermostat("BedRoom");

        System.out.println("Thermostat 1 location: " + t1.getLocation() + ", initial temperature: " + t1.getTemperature());
        System.out.println("Thermostat 2 location: " + t2.getLocation() + ", initial temperature: " + t2.getTemperature());
        System.out.println();

        // Call raise() 10 times in a loop
        System.out.println("--- Raising temperature of " + t1.getLocation() + " 10 times ---");
        for (int i = 1; i <= 10; i++) {
            t1.raise();
            System.out.println("Loop " + i + ": current temperature is " + t1.getTemperature());
        }

        // Call lower() 20 times in a loop
        System.out.println("\n--- Lowering temperature of " + t1.getLocation() + " 20 times ---");
        for (int i = 1; i <= 20; i++) {
            t1.lower();
            System.out.println("Loop " + i + ": current temperature is " + t1.getTemperature());
        }

        // Print activeCount
        System.out.println("\nTotal active thermostats: " + getActiveCount());
    }
}
