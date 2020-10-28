public class Rectangle {
    double x;
    double y;
    private static  int createdRectangles;
    private static final String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private static final String ENGLISH_CLASS_NAME = "Квадрат";
    Rectangle(double lenght, double weight) {
        x = lenght;
        y = weight;
        createdRectangles++;
    }

    Rectangle(double squarelenght) {
        x = squarelenght;
        y = squarelenght;
        createdRectangles++;
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
    public static void printRectanglesCount(){
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }
    public static void printClassname (boolean printRussian){
        if (printRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        }
        System.out.println(ENGLISH_CLASS_NAME);
    }
}
