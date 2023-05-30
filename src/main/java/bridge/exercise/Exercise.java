package bridge.exercise;

interface Renderer{
    String whatToRenderAs();
}

abstract class Shape {
    public Renderer renderer;
    public Shape(Renderer renderer){
        this.renderer = renderer;
    }
    public abstract String getName();
}

class VectorRenderer implements Renderer{
    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}

class RasterRenderer implements Renderer{
    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}

class Triangle extends Shape
{
    public Triangle(Renderer renderer){
        super(renderer);
    }

    @Override
    public String getName()    {
        return "Triangle";
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
    }
}

class Square extends Shape {

    public Square(Renderer renderer){
        super(renderer);
    }

    @Override
    public String getName()    {
        return "Square";
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
    }
}

public class Exercise {
    public static void main(String[] args) {
        System.out.println(new Square(new VectorRenderer()).toString());
    }
}

// imagine VectorTriangle and RasterTriangle are here too
