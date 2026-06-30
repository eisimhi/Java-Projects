public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice Levi","0525551234","HaShikma 12, Tel Aviv");
        Person p2 = new Person("Boris Cohen","0527778888","Herzl 5, Jerusalem");
        System.out.println("== People ==");
        System.out.println(p1);
        System.out.println(p2);
        Package pack1 = new Package(p1,11112222);
        Package pack2 = new Package(p1,11112222);
        Package pack3 = new Package(p2,33334444);
        System.out.println("== Packages(initial) ==");
        System.out.println("pack1: "+pack1);
        System.out.println("pack2: "+pack2);
        System.out.println("pack3: "+pack3);
        System.out.println("== equals(..) checks ==");
        System.out.println("pack1.equals(pack2)? "+pack1.equals(pack2));
        System.out.println("pack1.equals(pack3)? "+pack1.equals(pack3));
        System.out.println("== before(..) check ==");
        System.out.println("pack1.before(pack3)? "+pack1.before(pack3));
        System.out.println("== after(..) check ==");
        System.out.println("pack3.after(pack1)? "+pack3.after(pack1));
        System.out.println("== Boris's package status progression to ARRIVED ==");
        System.out.println("Status now: "+pack3.getStatusName());
        pack3.updateStatus();
        System.out.println("After updateStatus(): "+pack3.getStatusName());
        pack3.updateStatus();
        System.out.println("After updateStatus(): "+pack3.getStatusName());
        pack3.updateStatus();
        System.out.println("After updateStatus(): "+pack3.getStatusName());
        System.out.println("== Deliver Boris's package ==");
        boolean success = pack3.deliver(p2);
        System.out.println("deliver(boris) success? " + success);
        System.out.println("Is the package delivered? " +pack3.isDelivered());
        System.out.println("After updateStatus(): "+pack3.getStatusName());
        System.out.println("pack3: "+pack3);

    }
}