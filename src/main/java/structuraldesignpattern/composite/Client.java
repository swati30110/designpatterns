package structuraldesignpattern.composite;

public class Client {
    public static void main(String[] args) {
        FinalPackage finalPackage = new FinalPackage();
        finalPackage.add(new Box());
        finalPackage.add(new Product());

    }
}
