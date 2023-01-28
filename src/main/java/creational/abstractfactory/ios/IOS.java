package creational.abstractfactory.ios;

import creational.abstractfactory.Cursor;
import creational.abstractfactory.OS;
import creational.abstractfactory.Tab;

public class IOS implements OS {
    @Override
    public Tab createTab() {
        return new IOSTab();
    }

    @Override
    public Cursor createCursor() {
        return new IOSCursor();
    }
}
