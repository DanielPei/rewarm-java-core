package models.decorator;

public abstract class ComponentDecorator extends Component{

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Operation in " + this.getClass().getName());
        if (component!= null){
            component.operation();
        }
    }
}
