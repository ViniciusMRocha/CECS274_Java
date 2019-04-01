public class Lab_Chapter13_3 {
    public static void main(String[] args) {
        System.out.println("GCD = " + euclid(135,20));
    }

    public static int euclid (int x, int y) {
        if (x == 0 || y == 0) {
            return x+y ;
        }
        else{
            int larger;
            int smaller;

            if (x >= y) { larger = x;}
            else { larger = y;}

            if (x < y) { smaller = x;}
            else { smaller = y;}

            int remainder = larger % smaller;

            larger = remainder;

            return euclid (remainder, smaller);

            }
        }
    }