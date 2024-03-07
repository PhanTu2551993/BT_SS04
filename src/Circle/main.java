package Circle;
public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5.0);

        double chuVi1 = circle1.chuVi();
        double dienTich1 = circle1.dienTich();

        double chuVi2 = circle2.chuVi();
        double dienTich2 = circle2.dienTich();

        System.out.println("Hình tròn 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Chu Vi = " + chuVi1);
        System.out.println("Diện tích = " + dienTich1);

        System.out.println("\nHình tròn 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Chu Vi = " + chuVi2);
        System.out.println("Diện tích = " + dienTich2);
    }
}
