package HomeWok4LibBugFix;

public class Book {

    private String nameBook;
    private Genre genre;
    private Author author;

    public Book(String nameBook, Genre genre, Author author) {
        this.nameBook = nameBook;
        this.genre = genre;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Genre getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    public StringBuilder bookBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append(getAuthor() + "\nBook :" + getNameBook() + "\nGenre :" + getGenre().getGenre() + "\n");
        return builder;
    }
}

