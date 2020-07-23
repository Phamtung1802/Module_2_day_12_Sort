package book;

public class FictionBook extends Book{
    String category;

    public FictionBook(String bookCode, String name, String author, Integer price, String category) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(){

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
