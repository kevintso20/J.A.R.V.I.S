package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class IncreaseVolume extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("changesysvolume 15000 ");

        return "";
    }

}