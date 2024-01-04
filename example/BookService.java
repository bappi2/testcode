package example;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public List<Book> getBooksInSort() {
        List<Book> books = new BookDAO().geBooks();
        /* Collections.sort(books, new myComparator()); */
        /*Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().compareTo(o1.getName());
            }
        }); */
        Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return  books;
    }
    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

class myComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
