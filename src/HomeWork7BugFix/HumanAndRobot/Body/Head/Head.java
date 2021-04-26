package HomeWork7BugFix.HumanAndRobot.Body.Head;

public interface Head extends Beard, Eyes, Mustache {
    void speak();
    void noSpeak();
    @Override
    default void growBeard() {

    }

    @Override
    default void shaveOfBeard() {

    }

    @Override
    default void open() {

    }

    @Override
    default void close() {

    }

    @Override
    default void normalVision() {

    }

    @Override
    default void dabVision() {

    }

    @Override
    default void growMustache() {

    }

    @Override
    default void shaveOfMustache() {

    }
}
