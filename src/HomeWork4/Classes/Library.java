package HomeWork4.Classes;

public class Library extends Author {
    private String nameLibrary;
    private String country;
    public void setLibrary(String nameLibrary, String country){
        this.nameLibrary = nameLibrary;
        this.country = country;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    @Override
    public String getCountry() {
        return country;
    }

    public String toString(){
        return "Library : " + getNameLibrary() + "\nCountry : " + getCountry() + "\nName Author : " + getName() + " " + getLastName() +
                "\nName book : " + getNameBook() + "\n**********************" ;
    }
}
