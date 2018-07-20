package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class AltF4 extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendkeypress alt+f4");

        return "";
    }

}
