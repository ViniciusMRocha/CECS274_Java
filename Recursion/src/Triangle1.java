/*   Nillan Shah & Vini Rocha
     March 13, 2019
     Purpose: Build a pascal triangle using recursion
     Inputs: How many rows do you want the triangle to be
     Output: Pascal's triangle
*/

public class Triangle1 {
    public static void main(String[] args) {
    // input how many rows the user wants
    triangle(10);
    }

    public static void triangle(int n) {
        // outter loop creates the row
        for (int i = 0; i < n; i++) {
            //in the end of each row, it return to the next line
            System.out.print("\n");
            // the inner loop creates the columns, by calling the pascal method
            for (int j = 0; j <= i; j++){
                //prints the value for each column given the row
                System.out.print(pascal(i,j)+" ");
            }
        }
    }

    public static int pascal(int i, int j) {
        // base case: for the first and last column of each row, print 1
        if (j == 0 || j == i) {
            return 1;
        }
        // calculates the value of the pascal's triangle by getting 2 numbers of the previous row. the one on the same
        // position (i-1,j) and the second one position before (i-1,j-1)
        else
            return pascal(i-1,j-1)+pascal(i-1,j);
    }
}