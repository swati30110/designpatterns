package structuraldesignpattern.adaptor;

import lombok.Getter;

@Getter
public class RoundPeg {
    double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }
}
