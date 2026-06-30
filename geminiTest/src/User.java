import java.util.Scanner;

public class User implements Loggable {
    private String email;
    private String name;

    @Override
    public void logInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("what is your email?");
        String emailAddress=in.nextLine();
        if (emailAddress.contains("@")){
            this.email=emailAddress;
        }else {
            System.out.println("Invalid");
            System.exit(22);
        }
        System.out.println("what is your name?");
        String name=in.nextLine();
        this.name=name;
        System.out.println("Email: "+this.email+" Name: "+this.name);
    }
}
