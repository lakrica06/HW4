public class Main {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(9, 12);
    Rectangle rectangle2 = new Rectangle(3,8);
    Rectangle square = new Rectangle(6);

    rectangle.printArea();
    rectangle2.printArea();
    square.printArea();

    rectangle.printRectangleKind();
    rectangle2.printRectangleKind();
    square.printRectangleKind();

    rectangle.inTheSameRectangle(square);
    }
}
