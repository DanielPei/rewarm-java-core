package models.builder;

public class BuilderFat extends BuilderBase{

    public BuilderFat(String graph, String pen) {
        super(graph, pen);
    }

    @Override
    void drawHead() {
        System.out.println(getClass().getName() + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    void drawBody() {
        System.out.println(getClass().getName() + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    void drawHands() {
        System.out.println(getClass().getName() + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    void drawLegs() {
        System.out.println(getClass().getName() + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
