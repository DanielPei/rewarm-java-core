package models.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Component root = new Composite("Root");

        root.addComponent(new Leaf("RLA"));
        root.addComponent(new Leaf("RLB"));

        Component compA = new Composite("CompA");
        compA.addComponent(new Leaf("A1"));
        compA.addComponent(new Leaf("A2"));
        root.addComponent(compA);

        Component compB = new Composite("CompB");
        compB.addComponent(new Leaf("B1"));
        compB.addComponent(new Leaf("B2"));
        compA.addComponent(compB);

        root.display(1);
    }
}
