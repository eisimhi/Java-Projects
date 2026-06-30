// ===========================
// File: PersonBasicTester.java
// Purpose: basic tests for Person
// No arrays, no loops, no invalid cases
// ===========================
public class PersonStudTester {
    public static void main(String[] args) {
        // 1) Constructor
        Person p1 = new Person("Alice Levi",  "0525551234", "HaShikma 12, Tel Aviv");
        Person p2 = new Person("Boris Cohen", "0527778888", "Herzl 5, Jerusalem");

        System.out.println("== Created persons ==");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        // 2) equals
        System.out.println("\n== p1.equals(p2) check ==");
        System.out.println("Expected = false");
        System.out.println("Actual   = " + p1.equals(p2));

        // 3) before / 5) after
        System.out.println("\n== p1.before(p2) checks ==");
        System.out.println("Expected = true");
        System.out.println("Actual   = " + p1.before(p2));

        // 4) after
        System.out.println("\n== p1.after(p2) checks ==");
        System.out.println("Expected = false");
        System.out.println("Actual   = " + p1.after(p2));
        // Done
        System.out.println("\n== end of Person basic tester ==");
    }
}
