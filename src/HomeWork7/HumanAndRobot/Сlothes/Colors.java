package HomeWork7.HumanAndRobot.Сlothes;

public enum Colors {
    YELLOW(1,"yellow"),
    GREEN(2,"green"),
    BLUE(3,"blue"),
    BROWN(4,"brown"),
    WHITE(5,"white"),
    RED(6,"red"),
    ORANGE(7,"orange"),
    PINK(8,"pink"),
    GRAY(9,"gray"),
    BLACK(10,"black");

    int number;
    String value;

    Colors(int number, String value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public String getValue() {
        return value;
    }
}
