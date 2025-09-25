package week10.ex32;

import java.util.Objects;

public class Thing {
    private String name;
    private  int weight;

    public Thing(String name, int weight) {
        if (weight < 0) { throw new IllegalArgumentException("Weight cannot be negative"); }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing)) return false;
        Thing thing = (Thing) o;
        return Objects.equals(this.name, thing.name); // ignore weight
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
