package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class UnMuteVolume extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("mutesysvolume 0");

        return "unmuted";
    }

}