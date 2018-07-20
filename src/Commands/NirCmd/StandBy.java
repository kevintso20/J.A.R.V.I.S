package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class StandBy extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("standby");

        return "";
    }

}
