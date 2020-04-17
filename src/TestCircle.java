public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        System.out.println(c1.getRadius());

        Circle c2 = new Circle(50);
        System.out.println(c2.getArea());
        System.out.println(c2.getRadius());
    }
}
