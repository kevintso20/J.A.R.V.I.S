package Others;

import Commands.Discord;
import Commands.Downloads;
import Commands.MyPC;
import Commands.Firefox;
import Commands.LeagueOfLegends;
import Commands.NirCmd.AltF4;
import Commands.NirCmd.Copy;
import Commands.NirCmd.CopyLink;
import Commands.NirCmd.Paste;
import Commands.NirCmd.DecreaseVolume;
import Commands.NirCmd.DoubleClick;
import Commands.NirCmd.EmptyRecyrcleBin;
import Commands.NirCmd.IncreaseVolume;
import Commands.NirCmd.LeftClick;
import Commands.NirCmd.MaxVolume;
import Commands.NirCmd.MoveMouseDown;
import Commands.NirCmd.MoveMouseLeft;
import Commands.NirCmd.MoveMouseRight;
import Commands.NirCmd.MoveMouseUp;
import Commands.NirCmd.MuteVolume;
import Commands.NirCmd.RightClick;
import Commands.NirCmd.Save;
import Commands.Notepad;
import Commands.NirCmd.ScreenOff;
import Commands.NirCmd.ScreenShot;
import Commands.NirCmd.SelectAll;
import Commands.NirCmd.ShutDownPc;
import Commands.NirCmd.StandBy;
import Commands.NirCmd.TaskManager;
import Commands.NirCmd.UnMuteVolume;
import Commands.NirCmd.ZeroVolume;
import Commands.Steam;
import Commands.Web.Facebook;
import Commands.Web.Gmail;
import Commands.Web.Google;
import Commands.Web.Instagram;
import Commands.Web.PornHub;
import Commands.Web.WebSearch;
import Commands.Web.Youtube;
import Interfaces.DoCommand;
import Speech.PcSpeaking;
import java.util.HashMap;
import com.sun.speech.freetts.*;

public class CommandsManager {

    public void SearchCommand(String command) {

        HashMap<String, DoCommand> hashMap = new HashMap<>();

        hashMap = fillHashmap(hashMap);

        if (hashMap.containsKey(command)) {
            String finaltext;
            finaltext = hashMap.get(command).exec(command);

            PcSpeaking pc = new PcSpeaking();
            pc.speak(finaltext);
        }

    }

    private HashMap fillHashmap(HashMap<String, DoCommand> hashMap) {

        DoCommand notepad = new Notepad();
        DoCommand league = new LeagueOfLegends();
        DoCommand discord = new Discord();
        DoCommand firefox = new Firefox();
        DoCommand steam = new Steam();
        DoCommand downloads = new Downloads();
        DoCommand google = new Google();
        DoCommand facebook = new Facebook();
        DoCommand youtube = new Youtube();
        DoCommand gmail = new Gmail();
        DoCommand pornHub = new PornHub();
        DoCommand mypc = new MyPC();
        DoCommand screenOff = new ScreenOff();
        DoCommand muteVolume = new MuteVolume();
        DoCommand maxVolume = new MaxVolume();
        DoCommand ShutDown = new ShutDownPc();
        DoCommand zeroVolume = new ZeroVolume();
        DoCommand unMute = new UnMuteVolume();
        DoCommand incVolume = new IncreaseVolume();
        DoCommand decVolume = new DecreaseVolume();
        DoCommand emptyBin = new EmptyRecyrcleBin();
        DoCommand screenShot = new ScreenShot();
        DoCommand leftClick = new LeftClick();
        DoCommand rightClick = new RightClick();
        DoCommand leftDoubleClick = new DoubleClick();
        DoCommand mouseUp = new MoveMouseUp();
        DoCommand mouseDown = new MoveMouseDown();
        DoCommand mousLeft = new MoveMouseLeft();
        DoCommand mouseRight = new MoveMouseRight();
        DoCommand save = new Save();
        DoCommand taskmanager = new TaskManager();
        DoCommand altf4 = new AltF4();
        DoCommand instagram = new Instagram();
        DoCommand webSearch = new WebSearch();
        DoCommand standBy = new StandBy();
        DoCommand copy = new Copy();
        DoCommand paste = new Paste();
        DoCommand selectAll = new SelectAll();
        DoCommand copyLink = new CopyLink();

        hashMap.put("open notepad", notepad);
        hashMap.put("close notepad", notepad);
        hashMap.put("open lol", league);
        hashMap.put("close lol", league);
        hashMap.put("open discord", discord);
        hashMap.put("close discord", discord);
        hashMap.put("open firefox", firefox);
        hashMap.put("close firefox", firefox);
        hashMap.put("open steam", steam);
        hashMap.put("close steam", steam);
        hashMap.put("open downloads", downloads);
        hashMap.put("close downloads", downloads);
        hashMap.put("open google", google);
        hashMap.put("open facebook", facebook);
        hashMap.put("open pornhub", pornHub);
        hashMap.put("open youtube", youtube);
        hashMap.put("open gmail", gmail);
        hashMap.put("open my pc", mypc);
        hashMap.put("close my pc", mypc);
        hashMap.put("screen off", screenOff);
        hashMap.put("mute", muteVolume);
        hashMap.put("max volume", maxVolume);
        hashMap.put("shutdown", ShutDown);
        hashMap.put("zero volume", zeroVolume);
        hashMap.put("un mute", unMute);
        hashMap.put("increase volume", incVolume);
        hashMap.put("decrease volume", decVolume);
        hashMap.put("clear bin", emptyBin);
        hashMap.put("screenshot", screenShot);
        hashMap.put("left click", leftClick);
        hashMap.put("right click", rightClick);
        hashMap.put("double click", leftDoubleClick);
        hashMap.put("mouse up", mouseUp);
        hashMap.put("mouse down", mouseDown);
        hashMap.put("mouse left", mousLeft);
        hashMap.put("mouse right", mouseRight);
        hashMap.put("save", save);
        hashMap.put("task manager", taskmanager);
        hashMap.put("close that", altf4);
        hashMap.put("instagram", instagram);
        hashMap.put("search for bla bla", webSearch);
        hashMap.put("standby", standBy);
        hashMap.put("copy", copy);
        hashMap.put("paste", paste);
        hashMap.put("select all", selectAll);
        hashMap.put("copy link", copyLink);

        return hashMap;
    }
}
