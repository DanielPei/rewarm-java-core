package models.decorator;

public class ComponentDecoratorA extends ComponentDecorator{
    @Override
    public void operation() {
        super.operation();
        logicWithinA();
    }

    public void logicWithinA(){
        System.out.println("Logic in " + this.getClass().getName());
    }
}
