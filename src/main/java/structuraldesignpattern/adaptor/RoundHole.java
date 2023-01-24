package structuraldesignpattern.adaptor;

public class RoundHole {
    double radius;
    RoundHole(){}
    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
}
