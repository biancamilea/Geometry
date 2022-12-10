public class TestMyTriangle {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(10, 1);

        Triangle t1 = new Triangle(p1, p2, p3);

        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.print("Type: ");
        t1.printType();

        Triangle t2 = new Triangle(1, 1, 5, 5, 10, 1);
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.print("Type: ");
        t2.printType();
    }
}