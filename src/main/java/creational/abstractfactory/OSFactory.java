package creational.abstractfactory;

import creational.factory.IOS;
import creational.factory.OS;
import creational.factory.OSType;
import creational.factory.Windows;

public class OSFactory {
    public OS getInstance(OSType osType){
        switch (osType){
            case WINDOWS: return new Windows();
            case IOS: return new IOS();
        }
        return null;
    }
}
