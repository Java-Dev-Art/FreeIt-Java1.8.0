package HomeWork4.Classes;

public class Book extends Genre{
    private String nameBook;

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String bookToString() {
        return "Name Book :" + getNameBook();
    }
}
