package Commands.Web;

import Interfaces.DoCommand;
import Others.Manager;

public class PornHub extends Manager implements DoCommand {

    private final String PAGENAME = "pornhub";

    @Override
    public String exec(String text) {

        openWebPage(PAGENAME);

        return "yes sir";
    }
}
