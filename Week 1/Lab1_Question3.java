import java.util.Random;

public class Lab1_Question3 {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = 0;
        // Nested for loop, used to generate a set of three digits from highest to lowest value
        for (int i = x; i < 10; i++)
            for (int j = x; j < 10; j++)
                for (int k = x; k < 9; k++)
                    if ((i > j) && (j > k))
                        // Prints a sequence of the three numbers from greatest digit to lowest digit
                        System.out.println("The sequence is" + " " + i + j + k);
    }
}

// make nested for loops
