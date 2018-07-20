package Others;

import Commands.LeagueOfLegends;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager {

    private Process process;


    public void openProgram(String programName) {
        try {
            Runtime runTime = Runtime.getRuntime();
            process = runTime.exec(programName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeProgram(String programName) {
        try {
            Runtime runTime = Runtime.getRuntime();
            runTime.exec("taskkill /F /IM " + programName + ".exe");
        } catch (IOException ex) {
            Logger.getLogger(LeagueOfLegends.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void openWebPage(String webSiteName) {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("http://www." + webSiteName + ".com");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nircmdCommands(String nirCommand) {

        Path currentRelativePath = Paths.get("");
        String pathOfWorkingDirectory = currentRelativePath.toAbsolutePath().toString();

        try {
            Runtime runTime = Runtime.getRuntime();
            runTime.exec(pathOfWorkingDirectory + "\\" + "nircmd" + " " + nirCommand);
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
