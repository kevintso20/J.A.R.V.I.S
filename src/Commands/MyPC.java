package Commands;

import Interfaces.DoCommand;
import Interfaces.Program;
import Others.Manager;

public class MyPC extends Manager implements DoCommand, Program {

    private final String PATH = "explorer";
    private final String NAME = "explorer";

    @Override
    public String exec(String text) {

        String command[] = text.split(" ");
        if (command[0].equals("open")) {
            text = Open(text);
        } else {
            text = Close(text);
        }

        return text;
    }

    @Override
    public String Open(String text) {

        openProgram(NAME);

        return "i open it";
    }

    @Override
    public String Close(String text) {

        nircmdCommands("sendkeypress alt+f4");

        return "i close it";
    }

}
