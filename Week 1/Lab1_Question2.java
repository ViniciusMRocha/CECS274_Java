import java.util.Random;
import static java.lang.StrictMath.sqrt;

public class Lab1_Question2 {
    public static void main(String [] args) {

    Random rand = new Random();

    int x1 = rand.nextInt(11);
    int x2 = rand.nextInt(11);
    int y1 = rand.nextInt(11);
    int y2 = rand.nextInt(11);

    System.out.println("First Coordinates: ("+x1+","+x2+")");
    System.out.println("Second Coordinates: ("+y1+","+y2+")");

    int X_distance = Math.abs(x2 - x1)*Math.abs(x2 - x1);
    int Y_distance = Math.abs(y2 - y1)*Math.abs(y2 - y1);

    double distance = sqrt (X_distance+Y_distance);
    String roundDistance = String.format("%.4f", distance);

    System.out.println("The distance is: " + roundDistance);
    }
}
