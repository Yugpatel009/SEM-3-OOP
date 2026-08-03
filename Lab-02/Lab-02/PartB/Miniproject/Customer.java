/**
 * Customer - Lab 2 (Part B).
 * Demonstrates ENCAPSULATION: fields are private and read via getters.
 * A static counter hands out unique customer ids.
 */
public class Customer {
    private String name, email, mobile;
    private final String customerId;               // set once, never changes
    private static long customerCounter = 100;     // shared across all customers

    public Customer(String name, String email, String mobile) {
        this.customerId = generateCustomerId();    // e.g. "CUST101"
        this.name = name; 
        this.email = email; 
        this.mobile = mobile;
    }

    /** Static helper: increments the shared counter and builds the next id. */
    private static String generateCustomerId() {
        customerCounter++;
        return "CUST" + customerCounter;
    }

    public String getCustomerId() { return customerId; }
    public String getName()  { return name; }
    public String getEmail() { return email; }
    public String getMobile(){ return mobile; }
}
