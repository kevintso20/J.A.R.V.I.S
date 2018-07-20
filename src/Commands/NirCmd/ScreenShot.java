package Commands.NirCmd;

import Others.Manager;
import Interfaces.DoCommand;

public class ScreenShot extends Manager implements DoCommand {

    @Override
    public String exec(String text) {

        String pathToDesktop = System.getProperty("user.home") + "/Desktop";

        nircmdCommands("savescreenshot" + " " + pathToDesktop + "/screenshot.png");

        
        return "i put your screenshot on desktop";
    }

}
