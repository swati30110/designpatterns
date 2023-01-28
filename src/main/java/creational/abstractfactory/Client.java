package creational.abstractfactory;

import creational.factory.OSType;

public class Client {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os = (OS) osFactory.getInstance(OSType.WINDOWS);
        os.createCursor();
    }
}
