package creational.abstractfactory.ios;

import creational.abstractfactory.Tab;

public class IOSTab implements Tab {
    @Override
    public void createNewTab() {
        System.out.println("IOS Tab created");
    }
}
