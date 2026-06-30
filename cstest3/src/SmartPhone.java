
public class SmartPhone {
    private String Model;
    private double Price;
    private int GB;

    public SmartPhone(String model, double price, int gb){
        this.Model=model;
        this.Price=price;
        this.GB=gb;


    }

    public String getModel() {
        return Model;
    }
    public double getPrice(){
        return Price;
    }
    public int getGB(){
        return GB;
    }

    public void setModel(String model) {
        this.Model = model;
    }
    public void setPrice(double price){
        this.Price=price;
    }
    public void setGB(int gb){
        if (gb>0){
            this.GB=gb;
        }
    }
    public String toString() {
        return "Model: "+Model+"\n"+
                "Price: "+Price+"\n"+
                "GB: "+GB;
    }
}
