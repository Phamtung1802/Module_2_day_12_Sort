package book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    ArrayList<Book> bookList;

    public BookList() {
        this.bookList =new ArrayList();
    }

    public void add(Book book){
        bookList.add(book);
    }

    @Override
    public String toString(){
        StringBuffer list=new StringBuffer();
        for(Book a:this.bookList){
            list.append(a.toString());
            list.append(", ");
        }
        return list.toString();
    }

    public int totalPrice(){
        int total=0;
        for(Book a:this.bookList){
            total+=a.getPrice();
        }
        return total;
    }

    public int getLanguageCount(String language){
        int count=0;

        for(Book book:this.bookList){
            if(book instanceof ProgrammingBook){
                if(language.compareTo((((ProgrammingBook)book).language))==0) {
                    count++;
                }
            }
        }
        return count;
    }

    public String searchBookLinear(String name){
        int count=0;
        for(Book book:this.bookList){
              if(book.name.compareTo(name)==0){
                  return book.getPrice().toString();
              }
        }
            return "Book not found";
    }

    public void priceSortBubbly(){
        for(int i=0;i<bookList.size();i++){
            for(int j=i+1;j<bookList.size();j++){
                if(bookList.get(i).getPrice()>bookList.get(j).getPrice()){
                    Book temp=bookList.get(i);
                    bookList.set(i,bookList.get(j));
                    bookList.set(j,temp);
                }
            }
        }
    }

    public void priceSortSelection(){
        ArrayList<Book> sortingArr=new ArrayList<>();
        int e=bookList.size();
        for(int i=0;i<e;i++) {
            Book min = bookList.get(0);
            for (int j = i+1; j < bookList.size(); j++) {
                if (bookList.get(j).getPrice() < min.getPrice()) {
                    min = bookList.get(j);
                }
            }
            sortingArr.add(min);
            bookList.remove(min);
        }
        for(Book a: sortingArr){
            bookList.add(a);
        }
    }

    public void priceSortInsert(){
        ArrayList<Book> sortingArr=new ArrayList<>();
        int e=bookList.size();
        for(int i=0;i<e;i++) {
            if(sortingArr.isEmpty()){
                sortingArr.add(bookList.get(i));
            }
            for(int j=sortingArr.size();j>=0&&sortingArr.get(j).getPrice()<bookList.get(i).getPrice();j--){
                sortingArr.add(j, bookList.get)
            }
        }

    }
}
