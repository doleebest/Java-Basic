package extends1.ex;

public class Book extends Item{

    String name;
    int price;
    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn){
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    public void print(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(author);
        System.out.println(isbn);
    }


}
