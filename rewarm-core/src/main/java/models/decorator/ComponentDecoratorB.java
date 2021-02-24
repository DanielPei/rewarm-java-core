package models.decorator;

public class ComponentDecoratorB extends ComponentDecorator {

    @Override
    public void operation() {
        super.operation();
        logicWithinB();
    }

    public void logicWithinB() {
        System.out.println("Logic in " + this.getClass().getName());
    }
}
