import java.util.*;

public class Library implements Iterable<Book> {
    private Book[] books;


    public Library(Book... books) {
        this.setBooks(books);
    }

    private void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    public void sort() {
        this.books = Arrays.stream(this.books).sorted(new BookComparator())
                .toArray(Book[]::new);
    }

    private class LibraryIterator implements Iterator<Book> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }
    }
}