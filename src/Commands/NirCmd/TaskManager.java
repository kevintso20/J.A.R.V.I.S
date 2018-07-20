package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class TaskManager extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendkeypress ctrl+shift+esc");

        return "on it";
    }

}
