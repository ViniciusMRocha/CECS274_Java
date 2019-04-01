public class Main {
    public static void main(String[] args) {
        //using recursion to build triangle
        System.out.println("Recursive triangle\n" + nextRow(6));
        System.out.println("\nFor loop triangle");
        //using outer and inner loop
        triangle(6);
    }

    //returns pascals triangle number for corresponding (i,j) pair
    public static int getNumber(int i, int j) {
        if (j == 0 || i == j) {
            return 1;
        } else {
            return getNumber(i - 1, j - 1) + getNumber(i - 1, j);
        }
    }

    public static void triangle(int n) {
        //outer loop
        for (int i = 0; i <= n; i++) {
            //inner loop
            for (int j = 0; j <= i; j++) {
                System.out.print(getNumber(i, j) + " ");
            }
            System.out.println();
        }
    }
    /*

    outer loop, prints new line after entire sequence of pascals triangle is done
    passes starting max values into printColumn, which in turn decrements them

     */
    public static String nextRow(int row) {
        //return 1 when row = 0, aka first line of triangle
        if (row == 0) {
            return "1";
        } else {
            //decrement to next row, and restart the call to print column with new row number (# of columns printed)
            return (nextRow(row - 1) +"\n"+ printColumn(row, row));
        }
    }
    /*

    inner loop, prints each column for corresponding row (constant until outer loop decrements it)
    column variable get decremented each call, printing the value for each row (i), column (j)
    example for row 4: (getNumber(4, 4), getNumber(4, 3), getNumber(4, 2), getNumber(4, 1), getNumber(4, 0)
    when getNumber(4, 0) return 1

     */
    public static String printColumn(int row, int column){
        if (column == 0) {
            return "1 ";
        } else {
            //this works the same as a loop
            return printColumn(row, column - 1) + getNumber(row, column) + " ";
        }
    }
}