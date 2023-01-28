package behavioural.observer;

import java.io.File;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        File file = new File("/path/to/log.txt");
        LoggingListener logger = new LoggingListener(file,
                "Someone has opened the file: %s");
        editor.events.subscribe("open",logger);
    }
}
