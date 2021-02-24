package models.decorator;

public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("Operation in " + this.getClass().getName());
    }
}
