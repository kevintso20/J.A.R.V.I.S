package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class MoveMouseLeft extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendmouse move -30 0");

        return "";
    }

}