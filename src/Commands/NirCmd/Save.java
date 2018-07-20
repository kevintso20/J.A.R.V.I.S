package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class Save extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendkeypress ctrl+s");

        return "";
    }

}
