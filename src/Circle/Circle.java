package Circle;

public class Circle {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
//    geter và setter cho ban kinh

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    public double dienTich() {
        return Math.PI * radius * radius;
    }

}