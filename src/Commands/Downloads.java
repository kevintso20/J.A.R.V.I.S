package Commands;

import Interfaces.DoCommand;
import Others.Manager;
import Interfaces.Program;

public class Downloads extends Manager implements DoCommand, Program {

    private final String PATH = "explorer C:\\Users\\kevintso\\Downloads";
    private final String NAME = "explorer";

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
        try {
            Thread.sleep(400);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        openProgram("explorer");

        return "";
    }

}
