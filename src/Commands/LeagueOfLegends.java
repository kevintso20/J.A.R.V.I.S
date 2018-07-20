package Commands;

import Others.Manager;
import Interfaces.DoCommand;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.Program;

public class LeagueOfLegends extends Manager implements DoCommand, Program {

     private final String PATH = "C:\\games\\Riot Games\\League of Legends\\LeagueClient.exe";
    private final String NAME = "leagueclient";

    @Override
    public String exec(String text) {

        String command[] = text.split(" ");
        if (command[0].equals("open")) {
            Open(text);
        } else {
            Close(text);
        }

        return text;
    }

    @Override
    public String Open(String text) {   
            openProgram(PATH);       

        return "i open it";
    }

    @Override
    public String Close(String text) {
        closeProgram(NAME);

        return ":";
    }

}
