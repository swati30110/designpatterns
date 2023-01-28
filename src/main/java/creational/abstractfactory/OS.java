package creational.abstractfactory;

import java.awt.*;
//Abstract Factory
public interface OS {
    Tab createTab();
    Cursor createCursor();
}
