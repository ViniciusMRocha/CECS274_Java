public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

        /*The sort method of this class sorts an array, using the selection sort algorithm. */

    public class SelectionSorter {
        public static void sort(int[] a) {
            for (int i = 0; i < a.length - 1; i++) {
                int minPos = minimumPosition(a, i);
                ArrayUtil.swap(a, minPos, i); } }

    }