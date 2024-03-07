package QuadraticEquation;


public class Main {
    public static void main(String[] args) {
    QuadraticEquation equation = new QuadraticEquation();
    equation.inputData();

    double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        System.out.println("Phương trinh có 2 nghiệm: " + root1 + " và " + root2);
    } else if (discriminant == 0) {
        double root = equation.getRoot1();
        System.out.println("Phường trình có nghiem kép" + root);
    } else {
        System.out.println("Phương trình vô nghiệm");
    }
}}
