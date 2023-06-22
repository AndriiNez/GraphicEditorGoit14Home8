public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String nameShape, int radius) {
        super(nameShape);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void scaneNameShape() {
        super.scaneNameShape();
    }
}