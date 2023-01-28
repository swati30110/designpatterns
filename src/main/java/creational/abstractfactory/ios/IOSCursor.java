package creational.abstractfactory.ios;

import creational.abstractfactory.Cursor;

public class IOSCursor implements Cursor {
    @Override
    public void move() {
        System.out.println("Moved Ios cursor");
    }
}
