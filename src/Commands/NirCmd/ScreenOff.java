package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class ScreenOff extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("monitor off");

        return "screen turned off press any key or move mouse to active it again";
    }

}
