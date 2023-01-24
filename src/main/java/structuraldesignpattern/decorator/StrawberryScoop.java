package structuraldesignpattern.decorator;

public class StrawberryScoop implements IceCreamConeConstituents{
    IceCreamConeConstituents iceCreamConeConstituents;
    StrawberryScoop(){}
    StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        if(iceCreamConeConstituents != null)
            return iceCreamConeConstituents.getCost()+15;
        return 15;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituents != null)
            return iceCreamConeConstituents.getDescription()+" + Strawberry Scoop";
        return "Strawberry Scoop";
    }
}
