import java.util.Scanner;
import java.lang.String;

public class Lab1_Question1 {
    public static void main(String [] args)  {
        System.out.println("Enter first integer: ");
        System.out.println("Enter second integer: ");

        Scanner input = new Scanner(System.in);

        int integer2= input.nextInt();
        int integer1= input.nextInt();

        if (integer1 < integer2)
            System.out.println(integer1);
        else
            System.out.println(integer2);
    }
}
