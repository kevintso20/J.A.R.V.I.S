package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class EmptyRecyrcleBin extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        nircmdCommands("emptybin");

        return "recyrcle bin is empty";
    }

}