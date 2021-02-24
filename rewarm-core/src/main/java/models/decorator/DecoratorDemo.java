package models.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ComponentDecorator decoratorA = new ComponentDecoratorA();
        ComponentDecorator decoratorB = new ComponentDecoratorB();

        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);

        decoratorB.operation();


//        Operation in models.decorator.ComponentDecoratorB
//        Operation in models.decorator.ComponentDecoratorA
//        Operation in models.decorator.ConcreteComponent
//        Logic in models.decorator.ComponentDecoratorA
//        Logic in models.decorator.ComponentDecoratorB

    }
}
