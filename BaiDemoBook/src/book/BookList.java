package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public ArrayList<Integer> getPriceList() {
      ArrayList<Integer> price=new ArrayList<>();
      for(Book a:this.bookList){
          price.add(a.price);
      }
      return price;
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
            int j=i;
            while(j>0&&(bookList.get(j-1).getPrice()>current.getPrice())){
                bookList.set(j,bookList.get(j-1));
                j--;
            }
            bookList.set(j,current);
        }
    }

    public void sortBinary(){
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public int searchBinary(String name){
        sortBinary();
        int first=0;
        int last=bookList.size()-1;
        while (first<=last){
            int mid=(first+last)/2;
            if(bookList.get(mid).getName().compareTo(name)==0){
                return bookList.get(mid).getPrice();
            }
            if(bookList.get(mid).getName().compareTo(name)>0){
                last=mid-1;
            }
            if(bookList.get(mid).getName().compareTo(name)<0){
                first=mid+1;
            }
        }
        return -1;
    }
}
