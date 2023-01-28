package creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance(OSType.WINDOWS);
        os.createCursor();
        os.createTab();
    }
}
