package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class DoubleClick extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendmouse left dblclick");

        return "";
    }

}