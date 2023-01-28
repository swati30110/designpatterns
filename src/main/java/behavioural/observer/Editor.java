package behavioural.observer;

import java.io.File;
import java.util.List;

public class Editor {
    public EventManager events;
    private File file;
    Editor(){
        events = new EventManager();
    }

    void openFile(String path){
        this.file = new File(path);
        events.notify("open" , file.getName());
    }
}
