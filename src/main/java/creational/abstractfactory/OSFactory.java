package creational.abstractfactory;

import creational.abstractfactory.ios.IOS;
import creational.abstractfactory.window.Window;


public class OSFactory {
    public OS getInstance(OSType osType){
        switch (osType){
            case WINDOWS: return new Window();
            case IOS: return new IOS();
        }
        return null;
    }
}
