public class Cat extends Mammal {
    private int mustashLength;
    private int jumpHeight;

    public Cat(int h,int w,String color,int mp,int mn,int ml,int jh){
        super(h, w, color, mp, mn);
        this.mustashLength=ml;
        this.jumpHeight=jh;

    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getMustashLength() {
        return mustashLength;
    }

    public void setMustashLength(int mustashLength) {
        this.mustashLength = mustashLength;
    }
}
