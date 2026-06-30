public class person {
    private int height;
    private String id;
    private Car car;

    public person(){
        this.height=175;
        this.id="123456789";
        this.car= new Car();

    }
    public person(int cmheight,String pid,Car newcar){
        this.height=cmheight;
        this.id=pid+"";
        this.car= new Car(newcar);
    }
    public Car getCar(){
        return car;
    }
    public String toString(){
        return
                "his height is: "+ height+"\n"+
                " and his id is: "+id+"\n"+
                " and his car is: "+car;
    }


}
