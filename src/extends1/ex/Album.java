package extends1.ex;

public class Album extends Item{
    String title;
    int price;
    String author;

    public Album(String title, int price, String author){
        this.title = title;
        this.price = price;
        this.author = author;
    }
}
