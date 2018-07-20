package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class MaxVolume extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("changesysvolume 65000");

        return "volume is max";
    }

}