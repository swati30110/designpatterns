package structuraldesignpattern.decorator;

public class OrangeCone implements IceCreamConeConstituents{
    IceCreamConeConstituents iceCreamConeConstituents;
    OrangeCone(){}
    OrangeCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        if(iceCreamConeConstituents != null)
            return iceCreamConeConstituents.getCost()+20;
        return 20;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituents != null)
            return iceCreamConeConstituents.getDescription()+" "+"Orange Cone";
        return "Orange Cone";
    }
}
