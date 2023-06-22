public class Diamond extends Shape{
    private int siedA;

    public Diamond(int siedA) {
        this.siedA = siedA;
    }

    public Diamond(String nameShape, int siedA) {
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
