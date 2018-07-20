package Commands.Web;

import Interfaces.DoCommand;
import Others.Manager;
import java.awt.Desktop;
import java.net.URI;

public class WebSearch implements DoCommand {

    @Override
    public String exec(String text) {

        String[] command = text.split(" ");
        String searchedThing = "";
        for (int i = 2; i < command.length; i++) {
            searchedThing = searchedThing + "+" + command[i];
        }
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://www.google.gr/search?q=" + searchedThing);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "yes sir";
    }
}
