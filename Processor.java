
package LEC_08_Objectanclass.EX1.EX8;

public class Processor {
    public static void main(String[] args) {

        double inputRadius = 4.0;
        CircleShape circle = new CircleShape(inputRadius);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
