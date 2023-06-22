public class Hexagon extends Shape{
    private int siedA;

    public Hexagon(int siedA) {
        this.siedA = siedA;
    }

    public Hexagon(String nameShape, int siedA) {
        super(nameShape);
        this.siedA = siedA;
    }

    public int getSiedA() {
        return siedA;
    }

    public void setSiedA(int siedA) {
        this.siedA = siedA;
    }

    @Override
    public void scaneNameShape() {
        super.scaneNameShape();
    }
}
