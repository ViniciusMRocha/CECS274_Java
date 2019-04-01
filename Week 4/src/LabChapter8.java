import java.lang.Math;
import java.util.Scanner;

public class LabChapter8 {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radiusValue = kb.nextDouble();

        System.out.printf("The area of the circle is: %.4f\n", CircleArea(radiusValue));
        System.out.printf("The circumference of the circle is: %.4f\n",CircleCircumference(radiusValue));
    }

    public static double CircleArea (double radius) {
        return Math.PI*(Math.pow(radius,2));
    }

    public static double CircleCircumference (double radius){
       return Math.PI*radius*2;

    }
}
