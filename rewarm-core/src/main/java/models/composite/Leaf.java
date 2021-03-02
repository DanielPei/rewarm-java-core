package models.composite;

import java.util.Collections;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void addComponent(Component component){
        try {
            throw new Exception("Not implement!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeComponent(Component component) {
        try {
            throw new Exception("Not implement!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "_")) + " " + this.name);
    }
}
