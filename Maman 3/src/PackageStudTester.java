// ===========================
// File: PackageStudTester.java
// Purpose: basic tests for Package (no arrays/loops, no invalid cases)
// Assumptions:
//   - Person(String name, String phone, String address)
//   - Package(Person recipient, int trackNum) with valid 8-digit track
//   - Status order: NONE -> PACKED -> SENT -> ARRIVED -> DELIVERED
// ===========================
public class PackageStudTester {
    public static void main(String[] args) {
        // --- People (used as recipients) ---
        Person alice = new Person("Alice Levi",  "0525551234", "HaShikma 12, Tel Aviv");
        Person boris = new Person("Boris Cohen", "0527778888", "Herzl 5, Jerusalem");

        System.out.println("== People ==");
        System.out.println("alice: " + alice); // uses Person.toString
        System.out.println("boris: " + boris);
        System.out.println();

        // --- Packages: two identical for Alice, one for Boris ---
        Package packA = new Package(alice, 11112222);
        Package packB = new Package(boris, 33334444);

        System.out.println("== Packages (initial) ==");
        System.out.println("packA: " + packA);
        System.out.println("packB: " + packB);
        System.out.println();

        // --- equals ---
        System.out.println("== equals ==");
        System.out.println("packA.equals(packB)");
        System.out.println("Expected = false");
        System.out.println("Actual   = " + packA.equals(packB));
        System.out.println();

        // --- ordering by recipient ---
        System.out.println("== ordering by recipient ==");
        System.out.println("packA.before(packB)");
        System.out.println("Expected = true");
        System.out.println("Actual   = " + packA.before(packB));
        System.out.println();
        System.out.println("packB.after(packA)");
        System.out.println("Expected = true");
        System.out.println("Actual   = " + packB.after(packA));
        System.out.println();

        // --- getters ---
        System.out.println("== getters ==");
        System.out.println("packA.getRecipient()");
        System.out.println("Expected = " + alice);
        System.out.println("Actual   = " + packA.getRecipient());
        System.out.println();
        System.out.println("packA.getTrackNum()");
        System.out.println("Expected = 11112222");
        System.out.println("Actual   = " + packA.getTrackNum());
        System.out.println();

        // --- setters (valid values only) ---
        System.out.println("== after packA.setTrackNum(22223333) ==");
        packA.setTrackNum(22223333);
        System.out.println("trackNum - Expected = 22223333");
        System.out.println("trackNum - Actual   = " + packA.getTrackNum());
        System.out.println();

        System.out.println("== packA.setRecipient(boris) ==");
        packA.setRecipient(boris);
        System.out.println("Expected = " + boris);
        System.out.println("Actual   = " + packA.getRecipient());
        System.out.println();

        // --- status progression for packC up to ARRIVED ---
        System.out.println("== status progression (packB) ==");
        System.out.println("Initial getStatusName()");
        System.out.println("Expected = NONE");
        System.out.println("Actual   = " + packB.getStatusName());
        System.out.println();

        packB.updateStatus(); // NONE -> PACKED
        packB.updateStatus(); // PACKED -> SENT
        packB.updateStatus(); // SENT -> ARRIVED
        System.out.println("After updateStatus()");
        System.out.println("Expected = ARRIVED");
        System.out.println("Actual   = " + packB.getStatusName());
        System.out.println();

        // --- deliver (only when ARRIVED) ---
        System.out.println("== deliver (packC to boris) ==");
        boolean delivered = packB.deliver(boris);
        System.out.println("Expected deliver(...) = true");
        System.out.println("Actual                = " + delivered);
        System.out.println();
        System.out.println("Expected isDelivered() = true");
        System.out.println("Actual                 = " + packB.isDelivered());
        System.out.println();
        System.out.println("Expected getStatusName() = DELIVERED");
        System.out.println("Actual                   = " + packB.getStatusName());
        System.out.println();
    }
}
