import java.util.*;

public class Main {
    public static void main(String[] args) {
        // creates an array list with set values
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(8, 35, 99, 88, 77, 100, 209, 334, 2));
        System.out.println("Unsorted: " + array);
        System.out.println();
        System.out.println("Sorted: " + bubbleSort(array));
    }]
    // method takes in a array list of integers
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> inputArray){
        // outter loop does each pass until the list is sorted (length -1)
        for (int i = 0; i < inputArray.size() - 1; i++){
            // inter loop compares the numbers
            for (int j = 0; j < inputArray.size() - 1 - i; j++){
                // compares if the first number is greater then the next number
                if (inputArray.get(j) > inputArray.get(j+1)) {
                    // if the first number is larger, swap the number
                    java.util.Collections.swap(inputArray, j, j+1);
                }
            }
        }
        return inputArray;
    }
}