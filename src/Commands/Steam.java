package Commands;

import Others.Manager;
import Interfaces.DoCommand;
import Interfaces.Program;

public class Steam extends Manager implements DoCommand, Program {

    private final String PATH = "C:\\Program Files (x86)\\Steam\\steam.exe";
    private final String NAME = "steam";

    @Override
    public String exec(String text) {

        String command[] = text.split(" ");
        if (command[0].equals("open")) {
            Open(text);
        } else {           
            Close(text);
        }

        return "";
    }

    @Override
    public String Open(String text) {
        openProgram(PATH);
        return "";
    }

    @Override
    public String Close(String text) {

        closeProgram(NAME);
        return "";
    }

}
