package structuraldesignpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class FinalPackage implements PackageInterface{

    ArrayList<PackageInterface> packages = new ArrayList<>();

    public void add(PackageInterface parcel){
        packages.add(parcel);
    }
    double totalCost;
    @Override
    public double getCost() {
        Iterator<PackageInterface> itr = packages.iterator();
        while (itr.hasNext()){
            totalCost += itr.next().getCost();
        }
        return totalCost;
    }


}
