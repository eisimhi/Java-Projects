public class Book {
    private String title;
    private int pages;

    public Book(String t, int p){
        this.pages=p;
        this.title=t;

    }
    public void printDetails(){
        System.out.println("The name of your book is: "+title);
        System.out.println("Your book has "+pages+" pages");
    }


    public String toString() {
        return "Book: "+title+"\n"+
                "Pages: "+pages;
    }
    public boolean isLongBook(){
        if (pages>300){
            System.out.println("this book is pretty long");
            return true;
        }else {
            System.out.println("this book isn't that long");
            return false;
        }
    }
}
