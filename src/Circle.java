public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
