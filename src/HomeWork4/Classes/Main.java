package HomeWork4.Classes;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthor("Artur", "Markowski", 30, "Belarus");
        author.setNameBook("Road is my Life");
        author.setFantasy();
        Library library = new Library();
        library.setLibrary("Jagellonian Uniwersity", "Poland");
        library.setNameBook("Road is my Life");
        library.setAuthor("Artur", "Markowski", 30, "Belarus");
//************************************************************************************
        System.out.println(author);
        System.out.println(library);
    }
}
