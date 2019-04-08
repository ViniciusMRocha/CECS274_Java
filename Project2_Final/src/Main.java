import java.lang.reflect.Array;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        // creates an array list with set values
        Scanner inputNum = new Scanner(System.in);  // Create a Scanner object
        System.out.print("How long do you want the array to be? ");
        String inputLenght = inputNum.nextLine();  // Read user input
        int inputLenghtNum = Integer.parseInt(inputLenght);

        int[] ArrayName = ArrayUtil.randomIntArray(inputLenghtNum, 10);
        System.out.println("Unsorted: " + Arrays.toString(ArrayName));

        System.out.println();
        System.out.println("Sorted: " + Arrays.toString(bubbleSort(ArrayName)));

        Scanner seachNum = new Scanner(System.in);  // Create a Scanner object
        System.out.println();
        System.out.print("What number are you looking for? ");
        String inputSearch = seachNum.nextLine();  // Read user input
        int inputSearchNum = Integer.parseInt(inputSearch);

        // Search the value on the array and print the first and last apparence possition. If the number is to there
        // the code will return -1 and the location where that number should be
        int[] foundIndexes = BinarySearcher.firstAndLast(bubbleSort(ArrayName), 0, inputLenghtNum, inputSearchNum);
        System.out.println("[" + foundIndexes[0] + ", " + foundIndexes[1] + "]");
    }

    // method takes in a array list of integers
    public static int[] bubbleSort(int[] ArrayName) {
        // outter loop does each pass until the list is sorted (length -1)
        for (int i = 0; i < ArrayName.length - 1; i++) {
            // inter loop compares the numbers

            for (int j = 0; j < ArrayName.length - 1 - i; j++) {
                // compares if the first number is greater then the next number

                if (ArrayName[j] > ArrayName[j + 1]) {
                    // if the first number is larger, swap the number

                    // Uses the variable swap to change the position of the numbers found
                    int swap = ArrayName[j];
                    ArrayName[j] = ArrayName[j + 1];
                    ArrayName[j + 1] = swap;
                }
            }
        }
        return ArrayName;
    }
}
