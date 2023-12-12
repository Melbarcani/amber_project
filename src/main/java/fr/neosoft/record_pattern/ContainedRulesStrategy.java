package fr.neosoft.record_pattern;

public class ContainedRulesStrategy {
    public int computeNetWeight(Contained contained) {
        if (contained instanceof Toys(var name, Weight(var net, var gross)))
            return net  + 100;
        if (contained instanceof Phones p)
            return p.weight().netWeight()+ 200;
        return contained.weight().netWeight();
    }
}
