public class Rectangle {
    double x;
    double y;
    Rectangle(double lenght, double weight) {
        x = lenght;
        y = weight;
    }

    Rectangle(double squarelenght) {
        x = squarelenght;
        y = squarelenght;
    }

    double calculateArea() {
        double z = x * y;
        return z;
    }

    void printArea() {
        System.out.println("Площадь равна " + calculateArea());
    }

    void printRectangleKind() {
        if (x == y) {
            System.out.println("Это квадрат");
        }
        System.out.println("Это прямоугольник");
    }

    boolean inTheSameRectangle(Rectangle a) {
    if(this.x == a.x && this.y == a.y) {
        System.out.println("Они равны");
        return true;
    }
        System.out.println("Они различны");
           return false;
    }
}
