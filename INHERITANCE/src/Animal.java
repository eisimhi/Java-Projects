
public class Animal {
    protected int weight;// יש שלוש דברים שמגדירים עד כמה המשתנה יהיה פנוי, יש PUBLIC שזה אומר שכל הקלאסים רואים אותו. יש PRIVATE שזה אומר שרק הקלאס שבו הוא נמצא יכולים לראות אותו ולהשתמש בו ויש PROTECTED  שזה אומר שרק המחלקה הזאת ומי שיורש אותה יכולים להשתמש בו
    protected int height;
    protected String color;

    public Animal(int weight, int height, String color){
        this.weight=weight;
        this.height=height;
        this.color=color+"";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
