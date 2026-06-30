public class Person implements Activities {
    int _age;
    int _height;
    String _name;

    public Person(int age, int height, String name){
        this._age=age;
        this._height=height;
        this._name=name;
    }

    @Override
    public void poop() {
        System.out.println("sitting on a toiler");
    }
}
