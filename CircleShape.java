package LEC_08_Objectanclass.EX1.EX8;

public class CircleShape {

    private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    
}
