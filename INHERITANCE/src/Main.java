import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);
        Animal a2 = new Cat(20, 70, "brown", 1, 5, 22, 40);
        System.out.println(a2 instanceof Animal);
        System.out.println(((Cat)a2).getColor());
        new Animal(50, 80, "black");
        new Mammal(70, 90, "white", 2, 3);
        new Dog(20, 70, "brown", 1, 5, "husky", "will", false);
        new Dog(2, 3, "orange", 2, 3, "idk", "dio", true);
        Mammal[] pets = new Mammal[4];

        for(int i = 0; i < pets.length; ++i) {
            if (i % 2 == 0) {
                pets[i] = new Dog(50 + i, 40 + i, "orange", 2 + i, 3 + i, "idk", "dio" + i, true);
            } else {
                pets[i] = new Cat(40 + i, 30 + i, "gray", 1 + i, 2 + i, 10 + i, 15 + i);
            }
        }

        for(int i = 0; i < pets.length; ++i) {
            System.out.println(pets[i].getHeight());
            if (pets[i] instanceof Dog) {
                System.out.println("This is a Dog! " + ((Dog)pets[i]).getName());
            } else if (pets[i] instanceof Cat) {
                System.out.println("This is a Cat! " + ((Cat)pets[i]).getJumpHeight());
            }
        }

    }
}