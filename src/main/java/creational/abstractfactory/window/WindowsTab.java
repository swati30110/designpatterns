package creational.abstractfactory.window;

import creational.abstractfactory.Tab;

public class WindowsTab implements Tab {
    @Override
    public void createNewTab() {
        System.out.println("Windows Tab created");
    }
}
