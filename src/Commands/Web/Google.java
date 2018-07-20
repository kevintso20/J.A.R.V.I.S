package Commands.Web;

import Interfaces.DoCommand;
import Others.Manager;
import java.awt.Desktop;
import java.net.URI;

public class Google extends Manager implements DoCommand {

    private final String PAGENAME = "google";
    @Override
    public String exec(String text) {      
        
        openWebPage(PAGENAME);

        return "yes sir";
    }

}
