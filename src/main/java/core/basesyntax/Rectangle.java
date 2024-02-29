package core.basesyntax;

public class Rectangle extends RandomFigure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Loading a Rectangle");
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + color);
        System.out.println("First side: " + firstSide);
        System.out.println("Second side: " + secondSide);
    }
}
