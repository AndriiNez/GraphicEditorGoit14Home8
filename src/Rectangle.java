public class Rectangle extends Shape{
    private int siedA, siedB;

    public Rectangle(int siedA, int siedB) {
        this.siedA = siedA;
        this.siedB = siedB;
    }

    public Rectangle(String nameShape, int siedA, int siedB) {
        super(nameShape);
        this.siedA = siedA;
        this.siedB = siedB;
    }

    public int getSiedA() {
        return siedA;
    }

    public void setSiedA(int siedA) {
        this.siedA = siedA;
    }

    public int getSiedB() {
        return siedB;
    }

    public void setSiedB(int siedB) {
        this.siedB = siedB;
    }

    @Override
    public void scaneNameShape() {
        super.scaneNameShape();
    }
}
