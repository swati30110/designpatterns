package behavioural.observer;

import java.io.File;

public class LoggingListener implements EventListener{
    private String log;
    private String message;

    LoggingListener(File file , String message){
        this.log = file.getName();
        this.message = message;
    }
    @Override
    public void update(String filename) {
        //log.write(replace('%s',filename,message))
    }
}
