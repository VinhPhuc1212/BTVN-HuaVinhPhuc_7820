package LEC_08_Objectanclass.EX1.EX7;

public class processor {

    public static void main(String[] args) {

        PointCoordinate point = new PointCoordinate(3.0, 4.0);

        double distance = point.distanceFromOrigin();
        System.out.println("Distance from origin (0,0): " + distance);
    }

}
