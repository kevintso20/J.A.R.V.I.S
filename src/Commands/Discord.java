package Commands;

import Others.Manager;
import Interfaces.DoCommand;
import Interfaces.Program;

public class Discord extends Manager implements DoCommand, Program {

    private final String PATH = "C:\\Users\\kevintso\\AppData\\Local\\Discord\\app-0.0.297\\Discord.exe";
    private final String NAME = "discord";

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
        openProgram(PATH);
        return "on it";
    }

    @Override
    public String Close(String text) {

        closeProgram(NAME);
        return getClass().getName() + " closed";
    }

}
