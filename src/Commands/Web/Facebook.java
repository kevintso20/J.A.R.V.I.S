package Commands.Web;

import Interfaces.DoCommand;
import Others.Manager;



public class Facebook extends Manager implements DoCommand {

    private final String PAGENAME = "facebook";
    @Override
    public String exec(String text) {      
        
        openWebPage(PAGENAME);

        return "yes sir";
    }

}