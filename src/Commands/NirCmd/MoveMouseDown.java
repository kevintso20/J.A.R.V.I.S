package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class MoveMouseDown extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendmouse move 0 -30");

        return "";
    }

}