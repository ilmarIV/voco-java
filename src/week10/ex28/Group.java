package week10.ex28;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> movables =  new ArrayList<Movable>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        movables.forEach(m -> sb.append(m.toString()).append("\n"));
        return sb.toString();
    }

    public void addToGroup(Movable movable) {
        this.movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        this.movables.forEach(m -> m.move(dx, dy));
    }
}
