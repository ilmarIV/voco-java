package week10.ex32;

public class OneThingBox extends Box {
    private Thing thing_in_box;

    public OneThingBox() {}

    public OneThingBox(Thing thing) {
        this.thing_in_box =  thing;
    }

    @Override
    public void add(Thing thing) {
        if (thing_in_box != null) { return; }
        this.thing_in_box = thing;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thing_in_box.equals(thing);
    }
}
