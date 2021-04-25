package HomeWok4LibBugFix;

public class main {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthor("Art","MArkouski", 25,"BLR");
        Book book = new Book("My road", Genre.EPIC,author);
        Library library = new Library();
        library.setLibrary("psmn","POL",book);
        System.out.println(library.toStringLibr());
        System.out.println(book.bookBuilder());
        library.setBooks(book);
        library.sizeLibr();
        Book book1 = new Book("History of Revolution", Genre.DETECTIVE,author);
        Book book2 = new Book("Oszmiany", Genre.FANTASY, author);
        Book book3 = new Book("Fite",Genre.NOVEL,author);
        Library library1 = new Library();
        Library library2 = new Library();
        Library library3 = new Library();
        library1.setLibrary("Jagello","BLR",book1);
        library2.setLibrary("My Kam","Argentina",book2);
        library3.setLibrary("Haaga","My",book3);
        System.out.println(library1.toStringLibr());
        System.out.println("***********");
        System.out.println(library2.toStringLibr());
        System.out.println("***********");
        System.out.println(library3.toStringLibr());
        System.out.println("*************");
        library.setBooks(book1);
        library.setBooks(book2);
        library.setBooks(book3);
        library.sizeLibr();
    }
}
