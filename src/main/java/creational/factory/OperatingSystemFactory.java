package creational.factory;

public class OperatingSystemFactory {

    public OS getInstance(OSType osType){
        switch (osType){
            case WINDOWS: return new Windows();
            case IOS: return new IOS();
        }
        return null;
    }
}
