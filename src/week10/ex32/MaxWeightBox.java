package week10.ex32;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> things =  new ArrayList<>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int currentWeight() {
        return things.stream().mapToInt(Thing::getWeight).sum();
    }

    @Override
    public void add(Thing thing) {
        if (currentWeight() + thing.getWeight()  > this.maxWeight) { return; }
        this.things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }
}
