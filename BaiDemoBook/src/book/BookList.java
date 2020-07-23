package book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    ArrayList<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList();
    }

    public void add(Book book) {
        bookList.add(book);
    }

    @Override
    public String toString() {

        return this.bookList.toString();
    }

    public int getTotalPrice() {
        int total = 0;
        for (Book a : this.bookList) {
            total += a.getPrice();
        }
        return total;
    }

    public int getLanguageCount(String language) {
        int count = 0;

        for (Book book : this.bookList) {
            if (book instanceof ProgrammingBook) {
                if (language.compareTo((((ProgrammingBook) book).language)) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public String searchBookLinear(String name) {
        int count = 0;
        for (Book book : this.bookList) {
            if (book.name.compareTo(name) == 0) {
                return book.getPrice().toString();
            }
        }
        return "Book not found";
    }

    public void priceSortBubbly() {
        for (int i = 0; i < bookList.size(); i++) {
            for (int j = i + 1; j < bookList.size(); j++) {
                if (bookList.get(i).getPrice() > bookList.get(j).getPrice()) {
                    Book temp = bookList.get(i);
                    bookList.set(i, bookList.get(j));
                    bookList.set(j, temp);
                }
            }
        }
    }

    public void priceSortSelection() {
        ArrayList<Book> sortingArr = new ArrayList<>();
        int e = bookList.size();
        for (int i = 0; i < e; i++) {
            Book min = bookList.get(0);
            for (int j = i + 1; j < bookList.size(); j++) {
                if (bookList.get(j).getPrice() < min.getPrice()) {
                    min = bookList.get(j);
                }
            }
            sortingArr.add(min);
            bookList.remove(min);
        }
        for (Book a : sortingArr) {
            bookList.add(a);
        }
    }

    public void priceSortInsert() {

        for (int i = 1; i < bookList.size();i++) {
            Book current=bookList.get(i);

            int j=i-1;
            while(j>=0&&bookList.get(j).getPrice()>current.getPrice()){
                System.out.println(bookList.get(j).getPrice()>=current.getPrice());
                bookList.set(i,bookList.get(j));
                bookList.set(j,current);

                j--;
            }

        }
        System.out.println(bookList);
    }
}
