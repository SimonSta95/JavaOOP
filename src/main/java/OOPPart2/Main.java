package OOPPart2;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Bibel", "Mathias", "000-000-001");
        Book book2 = new Book("Buch2", "Fabian", "123-456-789");
        Book book3 = new Book("Java for Dummies", "Simon", "133-712-345");

        Library library = new Library();

        library.addToLibrary(book1);
        library.addToLibrary(book2);
        library.addToLibrary(book3);

        System.out.println(library.toString());
        library.displayBooks();

        library.removeFromLibrary(book1);

        System.out.println(library.toString());
        library.displayBooks();


    }
}
