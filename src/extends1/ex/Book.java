package extends1.ex;

import java.security.spec.RSAOtherPrimeInfo;

public class Book extends Item{

    String name;
    int price;
    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn){
        super(name,price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("author: "+author+" isbn: "+isbn );
    }
}
