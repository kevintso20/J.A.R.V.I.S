package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class MuteVolume extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("mutesysvolume 1");

        return "";
    }

}