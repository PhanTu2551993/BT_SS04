package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public void inputData (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a");
         this.a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập so b");
         this.b= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so c");
         this.c = Double.parseDouble(scanner.nextLine());

    }
}
