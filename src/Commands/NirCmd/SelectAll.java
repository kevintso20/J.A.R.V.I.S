package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class SelectAll extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendkeypress ctrl+a");

        return "";
    }

}
