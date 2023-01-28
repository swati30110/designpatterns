package creational.abstractfactory.window;

import creational.abstractfactory.Cursor;
import creational.abstractfactory.OS;
import creational.abstractfactory.Tab;

public class Window implements OS {

    @Override
    public Tab createTab() {
        return new WindowsTab();
    }

    @Override
    public Cursor createCursor() {
        return new WindowsCursor();
    }
}
