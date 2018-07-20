package Commands.Web;

import Interfaces.DoCommand;
import Others.Manager;



public class Youtube extends Manager implements DoCommand {

    private final String PAGENAME = "youtube";
    
    @Override
    public String exec(String text) {      
        
        openWebPage(PAGENAME);

        return "yes sir";
    }
}
