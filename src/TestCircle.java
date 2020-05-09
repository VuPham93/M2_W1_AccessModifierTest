public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle();

        Circle circle2 = new Circle();
        circle2.setColor("blue");
        circle2.setRadius(100);

        System.out.println(circle1.getRadius() + "|" + circle1.getColor());
        System.out.println(circle2.getRadius() + "|" + circle2.getColor());
    }
}
