package creational.abstractfactory.window;

import creational.abstractfactory.Cursor;

public class WindowsCursor implements Cursor {
    @Override
    public void move() {
        System.out.println("Windows Cursor moved");
    }
}
