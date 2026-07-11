package construct.ex;

public class Book {
    String title;
    String author;
    int page; // 페이지 수

    Book(){
    // 기본 생성자
        this("", "", 0);
    }

    // 저자, 제목
    Book(String title, String author){
        this(title, author, 0);
    }

    // 모든 생성자
    Book(String title, String author, int page){
        this.author = author;
        this.title = title;
        this.page=page;
    }

    public void displayInfo(){
        System.out.println("책 정보" + title + author + page);
    }
}
