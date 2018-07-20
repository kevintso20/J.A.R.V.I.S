package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class CopyLink extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendkeypress ctrl+l");

        return "";
    }

}
