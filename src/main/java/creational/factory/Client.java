package creational.factory;

public class Client {
    public static void main(String[] args) {
        OperatingSystemFactory osFactory = new OperatingSystemFactory();
        OS os = osFactory.getInstance(OSType.WINDOWS);
        os.run();
    }
}
