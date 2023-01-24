package structuraldesignpattern.adaptor;

import lombok.AllArgsConstructor;

// An adapter class lets you fit square pegs into round holes.
// It extends the RoundPeg class to let the adapter objects act
// as round pegs.

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    SquarePegAdapter(SquarePeg peg){
        super(peg.getWidth());
        this.peg = peg;
    }

    /**The adapter pretends that it's a round peg with a
     radius that could fit the square peg that the adapter
     actually wraps.
     */
    public double getRadius(){
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
