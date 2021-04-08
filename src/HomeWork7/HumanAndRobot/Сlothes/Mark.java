package HomeWork7.HumanAndRobot.Сlothes;

public enum Mark {
    MF(1,"mf"),
    NIKE(2,"nike"),
    ADIDAS(3,"adidas"),
    PUMA(4,"puma"),
    BOSS(5,"boss"),
    SYMBALBY(6,"symbalby"),
    LSTR(7,"lstr"),
    KROKUS(8,"krokus");

    int number;
    String value;

    Mark(int number, String value) {
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
