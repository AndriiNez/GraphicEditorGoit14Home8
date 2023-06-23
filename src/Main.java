public class Main {
    public static void main(String[] args) {
        GetShape printer = new GetShape();

        Shape circle = new Circle();
        printer.printShapeName(circle);
        Shape quad = new Quad();
        printer.printShapeName(quad);
        Shape rectangle = new Rectangle();
        printer.printShapeName(rectangle);
        Shape diamond = new Diamond();
        printer.printShapeName(diamond);
        Shape hexagon = new Hexagon();
        printer.printShapeName(hexagon);
    }
}
