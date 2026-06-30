import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HotelRoom h1 = new HotelRoom(307, 4);
        HotelRoom h2 = new HotelRoom(205, 3);
        HotelRoom h3 = new HotelRoom(402,2);
        h2.checkIn("Test Guest");
        System.out.println("Hotel rooms:");
        display(h1,h2,h3);
        System.out.println(" ");
        System.out.println("""  
                Hotel Menu:
                1 - Display rooms by room number (ascending)
                2 - Check-in to a room
                3 - Check-out from a room
                4 - Find available room by requested beds
                Enter your choice:  """);
        int choice =in.nextInt();
        if (choice<1||choice>4){
            System.out.println("Error: Invalid menu choice");
            return;
        }
        switch (choice){
            case 1:displaySorted(h1,h2,h3);break;
            case 2:System.out.println("Enter room number:");
                int roomNum = in.nextInt();
                System.out.println("Enter guest name:");
                in.nextLine();
                String name = in.nextLine();
                checkIn(name,roomNum,h1,h2,h3);break;
            case 3:System.out.println("Enter room number:");
                int lRoomNum= in.nextInt();
                checkOut(lRoomNum,h1,h2,h3);break;
            case 4:System.out.println("Enter requested number of beds (2-4):");
                int beds= in.nextInt();
                findAvailableByBeds(beds,h1,h2,h3);break;
        }

    }
    public static void displaySorted(HotelRoom a,HotelRoom b,HotelRoom c){
        HotelRoom first=a,second=b,third=c;
        if (a.before(b)&&a.before(c)){
            first=a;
            if (b.before(c)){
                second=b;
                third=c;
            }else{
                third=b;
                second=c;
            }}
         if (b.before(a)&&b.before(c)){
             first=b;
             if (c.before(a)){
                 second=c;
                 third=a;
             }else {
                 third=c;
                 second=a;
             }
         }
         if (c.before(a)&&c.before(b)){
             first=c;
             if (b.before(a)){
                 second=b;
                 third=a;
             }else {
                 third=b;
                 second=a;
             }
         }
        System.out.println("Hotel Rooms by room number:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
    public static void checkIn(String guestName,int roomNum,HotelRoom a,HotelRoom b,HotelRoom c) {
        if (roomNum!=402&&roomNum!=205&&roomNum!=307){
            System.out.println("Error: Room not available or not found");
            return;
        }
        if (roomNum==307){
           if (a.isOccupied()){
               System.out.println("Error: Room not available or not found");
           }else {
               a.checkIn(guestName);
               System.out.println(a);
           }
       }
       if (roomNum==205){
           if (b.isOccupied()){
               System.out.println("Error: Room not available or not found");
           }else {
               b.checkIn(guestName);
               System.out.println(b);
           }
       }
       if (roomNum==402){
           if (c.isOccupied()){
               System.out.println("Error: Room not available or not found");
           }else {
               c.checkIn(guestName);
               System.out.println(c);
           }
       }
    }
    public static void checkOut(int roomNum, HotelRoom a, HotelRoom b, HotelRoom c){
        if (roomNum!=402&&roomNum!=205&&roomNum!=307){
            System.out.println("Error: Room not available or not found");
            return;}
            if (roomNum==307){
                a.checkOut();
                System.out.println(a);
            }
          else  if (roomNum==205){
                b.checkOut();
                System.out.println(b);
            }
          else  if (roomNum==402){
                c.checkOut();
                System.out.println(c);
            }
        }
        public static void findAvailableByBeds(int beds,HotelRoom a,HotelRoom b,HotelRoom c){
            if (beds==2){
                System.out.println(c);
            }else if (beds==3){
                System.out.println("No available room with the requested number of beds");
                return;
            }else if (beds==4){
                System.out.println(a);
            }
        }
        public static void display(HotelRoom a,HotelRoom b,HotelRoom c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        }
    public static HotelRoom findRoomByNumber(int roomNum, HotelRoom a, HotelRoom b, HotelRoom c) {
        if (a.getRoomNum() == roomNum) return a;
        if (b.getRoomNum() == roomNum) return b;
        if (c.getRoomNum() == roomNum) return c;
        return null;
    }
}