package models.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Composite extends Component {
    private List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void addComponent(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "_")) + " " + this.name);
        this.componentList.forEach(child -> child.display(depth + 2));
    }
}
