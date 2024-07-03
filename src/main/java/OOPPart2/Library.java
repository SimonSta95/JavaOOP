package OOPPart2;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    public void displayBooks() {
        System.out.println("Library information's: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addToLibrary(Book book) {
        books.add(book);
    }

    public void removeFromLibrary(Book book) {
        books.remove(book);
    }
}
