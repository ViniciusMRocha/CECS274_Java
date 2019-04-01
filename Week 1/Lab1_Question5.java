import java.lang.Character;
import java.util.Scanner;
import java.lang.String;

// This program asks the user for input
// The input is n phone numbers
// Then the program calculates and displays how many times each digit was used

public class Lab1_Question5 {
    public static void main(String[] args) {

        // The variable LENGHT decides how many phone numbers are required
        final int LENGHT = 4;
        final int LENGHT_DIGITS = 10;
        // This is the array where the amount of digits is stored
        int [] digitsArray = new int[10];

        System.out.println("Please enter "+LENGHT+" phone number with 10 digits each");

        // Enter each input to the array
        for (int i = 0; i < LENGHT; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter phone number "+(i+1)+" : ");
            String phone = input.next();
            // The while loop assures that the amount of digits is 10
            while (phone.length() != LENGHT_DIGITS) {
                System.out.println("Your entry does not have 10 digits, try again");
                phone = input.next();
            }
            // for each character on the sting, convert them to integer and add one unit count to their respective possition on the array
            for (int j = 0; j < phone.length(); j++){
                // pull the character correspondent to the value of "j"
                char digitsChar = phone.charAt(j);
                // Converts the character to integer
                int digitsInt = Character.getNumericValue(digitsChar);
                // Add one unit count to the digitsArray
                digitsArray[digitsInt] = digitsArray[digitsInt]+1;
            }
        }
        // Print the results
        for (int n = 0; n<10; n++) {
            System.out.println("Quantity of "+n+" : "+digitsArray[n]);
        }
    }
}


