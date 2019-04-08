/**
 A class for executing binary searches in an array.
 */

// lets see if this works
public class BinarySearcher {
    /**
     Finds a value in a range of a sorted array, using the binary
     search algorithm.
     @param a the array in which to search
     @param low the low index of the range
     @param high the high index of the range
     @param value the value to find
     @return the index at which the value occurs, or -1
     if it does not occur in the array
     */


    public static int[] searchLeft(int[] a, int low, int high, int value) {
        //Get index that we will compare to value searching for
        int mid = (low + high) / 2;

        //2 element array to store index of found search value
        int[] range = new int[2];

        if (low <= high) {

            /* Added two extra conditions to prevent returning first found value
            Will only return mid index (found value) if is the

            1a) (last value in the array
            OR
            1b) the value to the left is less than the value we are searching for
            AND
            2)the value we are searching for


             */

            if ((mid == 0 || a[mid - 1] < value) && a[mid] == value){

                // If conditions above are met, put index (mid) into 0 element of array
                range[0] = mid;

                //Return range array
                return range;
            //If the mid we are comparing is less than value we are searching for, keep searching, in the subarray (mid + 1, and high)
            } else if (a[mid] < value ) {
                return searchLeft(a, mid + 1, high, value);

             // Search the other half of the array since the mid we are comparing is greater than the value we are searching for
            } else {
                return searchLeft(a, low, mid - 1, value);
            }

            //This else block will only be run if the value is not found
        } else {

            //If range is 0, the last index in the array,
            range[0] = -1;

            if (mid == 0){
                range[1] = 0;
            // If not the last array, return mid + 1, which will return the correct place where we would place the not found value
            } else {
                range[1] = mid + 1;
            }
            //Return completed not found array
            return range;
        }
    }

    public static int[] searchRight(int[] a, int low, int high, int value) {
        //Get index that we will compare to value searching for

        int mid = (low + high) / 2;
        //2 element array to store index of found search value
        int[] range = new int[2];
        if (low <= high) {

            /*

            Added two conditions to prevent returning first found value

            Conditions that must be met:
            1a) Mid is the last index in the array (a.length - 1)
              OR
            1b) the value that is to the right of mid is greater than the value we are searching for

            AND

            2) mid == the value we are searching for

             */
            if ((mid == a.length - 1 || a[mid + 1] > value) && a[mid] == value){

                //Conditions are met, so set element 1 to mid (found right most index of value we are searching for)
                range[1] = mid;
                return range;
            //if mid value is greater than the search value, set new high (mid - 1)
            } else if (a[mid] > value ) {
                return searchRight(a, low, mid - 1, value);
            } else {

                //Search the other half of the array since the mid value is less than the search value, set a new low as mid + 1
                return searchRight(a, mid + 1, high, value);
            }

        //This else block will only be run if the value is not found
        } else {
            //All not found cases will have range[0] = -1
            range[0] = -1;

            //Set 1 element to 0 if the mid = 0, because it is at the last index of the array
            if (mid == 0){
                range[1] = 0;
            // If not the last array, return mid + 1, which will return the correct place where we would place the not found value
            } else {
                //Return the index of where the value searched should be, mid + 1
                range[1] = mid + 1;
            }
            //Return completed not found array
            return range;
        }
    }

    public static int[] firstAndLast(int[] a, int low, int high, int value){
        int[] foundLeft = BinarySearcher.searchLeft(a, low, high, value);
        int[] foundRight = BinarySearcher.searchRight(a, low, high, value);

        int[] foundRange = new int [2];

        if (foundLeft[0] != -1) {

            //If value found, add foundRight index to the foundLeft array to create a array with the range
            foundLeft[1] = foundRight[1];
            return foundLeft;
        } else {
            //Return the not found index array
            //If value not found, searchRight and searchLeft return the same exact array.
            return foundLeft;
        }
    }
}