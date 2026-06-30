import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Animal[] a =new Animal[2];
        a[0] = new Cat(1,1,"black",1,1,1,1);
        a[1] = new Dog(1,2,"d",4,5,"d","d",true);
        for (Animal an : a) { // לולאות FOR המיוחדת בעצם לוקחת את המערך לא משנה מה הגודל שלו, ואומרת תעבור על כל הערכים במערך הזה אחד אחד תציב אותם בAN ואז תפעיל עליהם את הפעולה
            an.makeSound();
            if (an instanceof Dog){
                System.out.println(Activities.NAME);
                System.out.println( ((Dog) an).getName());
            }
        }
        Activities[] things = new Activities[3];
        things[0]=new Person(16,167,"Evyatar");
        things[1]=new Cat(1,2,"black",3,4,5,6);
        things[2]=new Dog(1,2,"blue",4,5,"huski","dio",true);

        for (Activities act : things){
            act.poop();
        }

    }
}