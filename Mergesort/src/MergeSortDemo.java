/**
 This program demonstrates the merge sort algorithm by
 sorting an array that is filled with random numbers.
 */
public class MergeSortDemo
{
    public static void main(String[] args)
    {
        for (int i=1; i<=50;i++) {
            int[] a = ArrayUtil.randomIntArray(i*10000, i*10000);
            MergeSorter.resetCounter();
            MergeSorter.sort(a);
            System.out.println("Array size: "+i*10000+"; comparisons: " + MergeSorter.getCounter());
        }
    }
}