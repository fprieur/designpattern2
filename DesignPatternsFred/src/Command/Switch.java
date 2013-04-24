package Command;

import java.util.ArrayList;
import java.util.List;

public class Switch {

    private List<Command> history;

    public Switch() {
        this.history = new ArrayList<Command>();
    }

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd); // optional 
        cmd.execute();
    }
}
