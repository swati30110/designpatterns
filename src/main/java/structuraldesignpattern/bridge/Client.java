package structuraldesignpattern.bridge;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
        remote.volumeUp();

    }
}
