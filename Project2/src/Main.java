import java.lang.reflect.Array;
        import java.util.*;
//import java.util.Random;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        int searchResult = search(bubbleSort(ArrayName), 0, inputLenghtNum, inputSearchNum);
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



    public static int search(int[] ArrayName, int low, int high, int value)

    {
        //StopWatchNano.reset();
        //StopWatchNano.start();
        int mid = (low + high) / 2;
        if (low <= high) {

            if (ArrayName[mid] == value)
            {
                int firstPosition = index.findIndex(ArrayName,value);
                int LastPos = shortenArray.LastPosition(ArrayName,value);

                System.out.println("First Position: "+firstPosition);
//
//
// TO BE FIXEDfind a way to return the value from shortArray
//
//
                System.out.println("LastPos : "+LastPos);

/*

OLDER VERSION OF SEARCH
                int lastIndex = -1;
                int count = -1;

                for (int i = 0; (i < ArrayName.length); i++)
                {
                    // if the value on indexed is equal to teh value searched
                    if (ArrayName[i] == value)
                    {
                        // count how many times the match happened
                        count = count + 1;
                        // gets the possition of the last number
                        lastIndex = i;
                    }
                }

                //substract the last index from the amount of times the element showed up, give the fist possition
                System.out.println("Result: [" + (lastIndex - count) + "," + lastIndex + "]");

*/
                return mid;
            }

            else if (ArrayName[mid] < value)
            {
                return search(ArrayName, mid + 1, high, value);
            }

            else
            {
                return search(ArrayName, low, mid - 1, value);
            }
        }

        else // Do the following if the value was not found
        {
            System.out.println("Value not found");
            System.out.println("[-1, "+low+"]");
            return -1;
        }

        //StopWatchNano.stop();
        //System.out.println(StopWatchNano.getElapsedTime());

    }
}