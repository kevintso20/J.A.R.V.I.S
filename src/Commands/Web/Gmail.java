package Commands.Web;

import Interfaces.DoCommand;
import Others.Manager;



public class Gmail extends Manager implements DoCommand {

    private final String PAGENAME = "gmail";
    
    @Override
    public String exec(String text) {      
        
        openWebPage(PAGENAME);

        return "yes sir";
    }
}