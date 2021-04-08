package HomeWork7.HumanAndRobot;

import HomeWork7.HumanAndRobot.Body.Body;
import HomeWork7.HumanAndRobot.Body.Head.Head;
import HomeWork7.HumanAndRobot.Сlothes.Clothes;
import HomeWork7.HumanAndRobot.Сlothes.Colors;
import HomeWork7.HumanAndRobot.Сlothes.Mark;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human implements Body, Head {
    private String name;
    private Date date;
    private boolean run;
    private boolean walk;
    private boolean speak;
//    private Clothes clothes;
    private Body body;
    private Head head;
    private Mark mark;
    private Colors colors;

    private StringBuilder colo;

    public Mark getMark() {
        return mark;
    }

    public Colors getColors() {
        return colors;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public void takeOnH(){
        colo = new StringBuilder();
        Clothes clothes = new Clothes() {
            @Override
            public void takeOnBlazer() {
                setColors(Colors.WHITE);
                setMark(Mark.ADIDAS);
                colo.append(Colors.WHITE + "\n");
                colors = Colors.WHITE;
            }

            @Override
            public void takeOnBoots() {
                setColors(Colors.BLACK);
                setMark(Mark.BOSS);
                colo.append(Colors.BLACK + "\n");
            }

            @Override
            public void takeOnGlasses() {
                setColors(Colors.GRAY);
                setMark(Mark.SYMBALBY);
                colo.append(Colors.GRAY + "\n");
            }

            @Override
            public void takeOnHat() {
                setColors(Colors.ORANGE);
                setMark(Mark.NIKE);
                colo.append(Colors.ORANGE + "\n");
            }

            @Override
            public void takeOnJacket() {
                setColors(Colors.YELLOW);
                setMark(Mark.BOSS);
                colo.append(Colors.YELLOW + "\n");
            }

            @Override
            public void takeOnPants() {
                setColors(Colors.GRAY);
                setMark(Mark.LSTR);
                colo.append(Colors.GRAY + "\n");
            }

            @Override
            public void takeOnShirt() {
                setColors(Colors.BLUE);
                setMark(Mark.PUMA);
                colo.append(Colors.BLUE + "\n");
            }

            @Override
            public void takeOnSocks() {
                setColors(Colors.BLACK);
                setMark(Mark.MF);
                colo.append(Colors.BLACK + "\n");
            }
        };
        System.out.println("Полностью наделся" + colo);
    }
    public void takeOfH(){
       Clothes clothes = new Clothes() {
           @Override
           public void takeOfBlazer() {
               System.out.println("Снял");
               setColors(null);
               setMark(null);
           }

           @Override
           public void takeOfBoots() {
               System.out.println("Снял");
               setColors(null);
               setMark(null);
           }

           @Override
           public void takeOfGlasses() {
               System.out.println("Снял");
               setColors(null);
               setMark(null);
           }

           @Override
           public void takeOfHat() {
               System.out.println("Снял");
               setColors(null);
               setMark(null);
           }

           @Override
           public void takeOfJacket() {
               System.out.println("Снял");
               setColors(null);
               setMark(null);
           }

           @Override
           public void takeOfPants() {
               System.out.println("Снял");
               setColors(null);
               setMark(null);
           }

           @Override
           public void takeOfShirt() {
               System.out.println("Снял");
               setColors(null);
               setMark(null);
           }

           @Override
           public void takeOfSocks() {
               System.out.println("Снял");
               setColors(null);
               setMark(null);
           }
       };
        System.out.println("Полностью разделся");
    }

    @Override
    public void forward() {
        this.walk = true;
    }

    @Override
    public void run() {
        this.run = true;
    }

    public void createHuman(Date date, String name){
        this.date = date;
        this.name = name;
    }

    public String getDate() {
        String dateFormat = "dd/MMMM/yyyy";
        SimpleDateFormat format  = new SimpleDateFormat(dateFormat);
        return "Дата рождения " + format.format(this.date);
    }

    @Override
    public void speak () {
        this.speak = true;
    }

    public String getName() {
        return name;
    }

    public boolean isRun() {
        return run;
    }

    public boolean isWalk() {
        return walk;
    }

    public boolean isSpeak() {
        return speak;
    }

    @Override
    public void noSpeak() {
        this.speak = false;
    }
    public String toStringHumanInfo(){
        return "Имя " + getName() + "\n" + getDate() + "\nЧеловек любит гулять " + isWalk() + "\nЧеловек любит бегать " + isRun()+
                "\nЧеловек любит говориить " + isSpeak();
    }
    public StringBuilder colo(){
        return colo;
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.takeOnH();
//        human.takeOfH();
        human.getMark();
        System.out.println(human.colo());

//        System.out.println(human.getMark());
    }
}
