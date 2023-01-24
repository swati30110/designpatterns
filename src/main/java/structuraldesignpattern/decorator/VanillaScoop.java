package structuraldesignpattern.decorator;

public class VanillaScoop implements IceCreamConeConstituents{

    IceCreamConeConstituents iceCreamConeConstituents;

    VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        if(iceCreamConeConstituents != null)
            return iceCreamConeConstituents.getCost()+ 10;
        return 10;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituents != null)
            return iceCreamConeConstituents.getDescription()+" + Vanilla Scoop";
        return "VanillaScoop";
    }
}
