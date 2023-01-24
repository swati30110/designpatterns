package structuraldesignpattern.decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents
                = new ChocoChips( new VanillaScoop( new StrawberryScoop()));
        System.out.println(iceCreamConeConstituents.getDescription());
        System.out.println(iceCreamConeConstituents.getCost());
    }
}
