package OOPPart2;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Bibel", "Mathias", "000-000-001");
        Book book2 = new Book("Buch2", "Fabian", "123-456-789");
        Book book3 = new Book("Java for Dummies", "Simon", "133-712-345");

        Book[] books = {book1, book2, book3};


        Library library = new Library(books);

        System.out.println(library.toString());
        library.displayBooks();

        Book book4 = new Book("Bibel2", "Markus", "000-000-002");
        library.setBooks(library.addToLibrary(book4));

        System.out.println(library.toString());
        library.displayBooks();

        library.setBooks(library.removeFromLibrary(book2));
        System.out.println(library.toString());
        library.displayBooks();
    }
}
