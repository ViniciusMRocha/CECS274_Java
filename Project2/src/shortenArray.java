import java.util.Arrays;

public class shortenArray {

    public static int LastPosition (int[] Arr, int value)
    {

        //gets the first position of the value on the Array List
        int firstPosition = index.findIndex(Arr,value);

        //Get a subarray starting with the value wanted
        int SmallArr [] = Arrays.copyOfRange(Arr, firstPosition, Arr.length);

        // get the last possition
        int getLastPosition = 99;

        // use pop to remote from the array?

        // Use while loop. Stop when the value on the index i in greater then the variable VALUE
        int i=0;
        // while the index value is less then or equal to the value that we are looking for
        while (SmallArr [i] <= value){
            i++;
        }
        getLastPosition = i+firstPosition;

        return getLastPosition;
    }
}

//
//
// This method is not passing back the value found
//for (; SmallArr [i] > value;i++)
//        {
//            //make the array smaller by removing the
//
//            int NewSmallArr [] = Arrays.copyOfRange(SmallArr, firstPosition+i, Arr.length);
//            getLastPosition = index.findIndex(NewSmallArr, value);
//            //getLastPosition = getLastPosition;
//        }
//