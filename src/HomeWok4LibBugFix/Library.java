package HomeWok4LibBugFix;

import java.util.ArrayList;

public class Library {
    private String nameLibrary;
    private String country;
    private Book book;
    private ArrayList<StringBuilder> books = new ArrayList<StringBuilder>();

    public void setLibrary(String nameLibrary, String country, Book book) {
        this.nameLibrary = nameLibrary;
        this.country = country;
        this.book = book;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public String getCountry() {
        return country;
    }

    public Book getBook() {
        return book;
    }

    public boolean setBooks(Book book) {
        return books.add(book.bookBuilder());
    }

    public void sizeLibr() {
        System.out.println("Количество книг в библиотеке :" + books.size());
    }

    public String toStringLibr() {
        return "Library : " + getNameLibrary() + "\nCountry : " + getCountry() + "\n" + getBook().bookBuilder() + "\n*****************";
    }
}
