import java.util.Scanner;

public class Shape implements GraphicEditor {
    private String nameShape;

    public Shape(){

    }

    public Shape(String nameShape){
        this.nameShape = nameShape;
    }

    public String getNameShape() {
        return nameShape;
    }

    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }
    @Override
    public void scaneNameShape(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть назву фігури: ");

        nameShape = in.nextLine();
        in.close();
    }
}

