package structuraldesignpattern.bridge;

public class TV implements Device{
    int volume;
    int channel;
    boolean on;

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {
        System.out.println("TV enabled");
    }

    @Override
    public void disable() {
        System.out.println("TV disabled");
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = this.volume * percent + this.volume;
    }

    @Override
    public int getChannel() {
        return this.getChannel();
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
