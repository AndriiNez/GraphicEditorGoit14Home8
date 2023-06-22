public class Quad extends Shape{
    private int siedA;

    public Quad(int siedA) {
        this.siedA = siedA;
    }

    public Quad(String nameShape, int siedA) {
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
