package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class RightClick extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendmouse right click");

        return "";
    }

}