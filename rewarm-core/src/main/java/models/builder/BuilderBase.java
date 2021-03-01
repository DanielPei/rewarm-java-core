package models.builder;

public abstract class BuilderBase {

    protected String pen;
    protected String graph;

    public BuilderBase(String graph, String pen) {
        this.graph = graph;
        this.pen = pen;
    }

    abstract void drawHead();

    abstract void drawBody();

    abstract void drawHands();

    abstract void drawLegs();
}
