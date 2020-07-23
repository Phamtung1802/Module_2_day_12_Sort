package book;

public class Book {
    String bookCode;
    String name;
    String author;
    Integer price;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Book(String bookCode, String name, String author, Integer price) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.price=price;
    }

    public Book(){

    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return this.name;
    }


}
