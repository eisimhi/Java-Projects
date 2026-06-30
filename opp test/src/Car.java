public class Car {
    private String model;
    private int price;
    private int id;
    private static int totalcars;

    public Car(){
        totalcars++;
        this.model="lambo";
        this.price=100000;
        this.id=totalcars;
    }
    public Car(String model,int price){
        totalcars++;
        this.model=model;
        this.price=price;
        this.id=totalcars;
    }
    public Car(Car c){
        totalcars++;
        this.model=c.model;
        this.price=c.price;
        this.id=totalcars;
    }

    @Override
    public String toString() {
        return "Model: "+model+"\n"+
                "Price: "+price+"\n"+
               "Total Cars: "+id;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
