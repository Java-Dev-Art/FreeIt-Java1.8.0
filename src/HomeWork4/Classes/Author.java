package HomeWork4.Classes;

public class Author extends Book{
    private String name;
    private String lastName;
    private int age;
    private String country;

    public void setAuthor(String name, String lastName, int age, String country) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return "Author \nName : " + getName() + "\nLast Name : " + getLastName() + "\nAge : " + getAge() + "\nCountry : " + getCountry()
                + "\n" + bookToString() + "\n" + genreToString() + "\n**************************";
    }
}
