package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class ShutDownPc extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("exitwin poweroff");

        return "bye!!";
    }

}
