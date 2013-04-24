package Command;

public class CommandTest {

    public static void Test() {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch s = new Switch();
        s.storeAndExecute(switchUp);
        s.storeAndExecute(switchDown);
    }
}
