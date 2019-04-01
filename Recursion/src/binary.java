public class binary {
    public static void main(String[] args) {

        tobinary (12);
     }

    public static String tobinary (int input) {
        int quotient = input / 2;
        int remainder = input % 2;

        if (quotient == 0) {
            return quotient+"";
        }

        else {
            return tobinary(quotient)+""+remainder;
        }

    }

}
