package OOPPart2;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                "}";
    }

    public void displayBooks() {
        System.out.println("Library information's: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book[] addToLibrary(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        newBooks[newBooks.length - 1] = book;
        return newBooks;
    }

    public Book[] removeFromLibrary(Book book) {
        Book[] newBooks = new Book[books.length - 1];
        int indexNew = 0;
        for (int i = 0; i < books.length; i++) {
            if (!books[i].equals(book)) {
                newBooks[indexNew] = books[i];
                indexNew++;
            }

        }
        return newBooks;
    }
}
