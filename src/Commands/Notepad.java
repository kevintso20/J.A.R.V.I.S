package Commands;

import Others.Manager;
import Interfaces.DoCommand;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.Program;

public class Notepad extends Manager implements DoCommand, Program {

    private final String PATH = "C:\\Windows\\system32\\notepad.exe";
    private final String NAME = "notepad";

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
        return "done";
    }

    @Override
    public String Close(String text) {

        closeProgram(NAME);

        return "notepad closed";
    }

}
