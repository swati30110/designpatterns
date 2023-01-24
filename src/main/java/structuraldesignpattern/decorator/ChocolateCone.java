package structuraldesignpattern.decorator;

public class ChocolateCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

    public ChocolateCone() {}

    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getCost() + 10;
        }
        return 10;
    }

    @Override
    public String getDescription() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
