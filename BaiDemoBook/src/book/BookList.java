package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookList extends ArrayList<Book> {


    public BookList() {
    }


    public int getTotalPrice() {
        int total = 0;
        for (Book a : this) {
            total += a.getPrice();
        }
        return total;
    }

    public ArrayList<Integer> getPriceList() {
        ArrayList<Integer> price = new ArrayList<>();
        for (Book a : this) {
            price.add(a.price);
        }
        return price;
    }

    public int getLanguageCount(String language) {
        int count = 0;

        for (Book book : this) {
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
        for (Book book : this) {
            if (book.name.compareTo(name) == 0) {
                return book.getPrice().toString();
            }
        }
        return "Book not found";
    }

    public void priceSortBubbly() {
        for (int i = 0; i < this.size(); i++) {
            for (int j = i + 1; j < this.size(); j++) {
                if (this.get(i).getPrice() > this.get(j).getPrice()) {
                    Book temp = this.get(i);
                    this.set(i, this.get(j));
                    this.set(j, temp);
                }
            }
        }
    }

    public void priceSortSelection() {
        ArrayList<Book> sortingArr = new ArrayList<>();
        int e = this.size();
        for (int i = 0; i < e; i++) {
            Book min = this.get(0);
            for (int j = i + 1; j < this.size(); j++) {
                if (this.get(j).getPrice() < min.getPrice()) {
                    min = this.get(j);
                }
            }
            sortingArr.add(min);
            this.remove(min);
        }
        for (Book a : sortingArr) {
            this.add(a);
        }
    }

    public void priceSortInsert() {
        for (int i = 1; i < this.size(); i++) {
            Book current = this.get(i);
            int j = i;
            while (j > 0 && (this.get(j - 1).getPrice() > current.getPrice())) {
                this.set(j, this.get(j - 1));
                j--;
            }
            this.set(j, current);
        }
    }

    public void sortBinary() {
        Collections.sort(this, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public int searchBinary(String name) {
        sortBinary();
        int first = 0;
        int last = this.size() - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (this.get(mid).getName().compareTo(name) == 0) {
                return this.get(mid).getPrice();
            }
            if (this.get(mid).getName().compareTo(name) > 0) {
                last = mid - 1;
            }
            if (this.get(mid).getName().compareTo(name) < 0) {
                first = mid + 1;
            }
        }
        return -1;
    }
}
