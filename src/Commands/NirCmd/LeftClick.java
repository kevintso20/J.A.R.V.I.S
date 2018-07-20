package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class LeftClick extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendmouse left click");

        return "";
    }

}