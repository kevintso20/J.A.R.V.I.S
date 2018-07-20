package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class Paste extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("sendkeypress ctrl+V");

        return "anthi wake up or i will kill you";
    }

}
