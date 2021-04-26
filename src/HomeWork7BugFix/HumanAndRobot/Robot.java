package HomeWork7BugFix.HumanAndRobot;

import HomeWork7BugFix.HumanAndRobot.Body.Body;
import HomeWork7BugFix.HumanAndRobot.Body.Head.Head;
import HomeWork7BugFix.HumanAndRobot.Сlothes.Clothes;

public class Robot implements Body, Head, Clothes {
    private String mark;
    private boolean speak;
    private boolean run;
    private boolean walk;

    public boolean isRun() {
        return run;
    }

    public boolean isWalk() {
        return walk;
    }

    @Override
    public void forward() {
        this.walk = true;
    }

    @Override
    public void run() {
        this.run = true;
    }

    public Robot(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public boolean isSpeak() {
        return speak;
    }

    @Override
    public void speak() {
        this.speak = true;
    }

    @Override
    public void noSpeak() {
        this.speak = false;
    }
    public String toStringRobotInfo(){
        return "Марка " + getMark()  + "\nТолько ходит " + isWalk() + "\nМожет бегать " + isRun() +
                "\nУмеет говориить " + isSpeak();
    }
}
