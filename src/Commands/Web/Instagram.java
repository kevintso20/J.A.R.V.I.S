package Commands.Web;

import Interfaces.DoCommand;
import Others.Manager;



public class Instagram extends Manager implements DoCommand {

    private final String PAGENAME = "instagram";
    @Override
    public String exec(String text) {      
        
        openWebPage(PAGENAME);

        return "yes sir";
    }

}