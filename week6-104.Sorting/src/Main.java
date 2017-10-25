
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        
        int [] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
     public static int smallest(int[] test) {
        int mini = test[0];
        for (int i = 0; i < test.length; i++) {
            if (mini <= test[i]) {
            } else {
                mini = test[i];
            }
        }
        return mini;
    }

    public static int indexOfTheSmallest(int[] test) {
        int index = 0;
        int mini = test[0];
        for (int i = 0; i < test.length; i++) {
            if (mini <= test[i]) {

            } else {
                mini = test[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] test, int index) {
        int mini = test[index];
        for (int i = index; i < test.length; i++) {
            if (mini <= test[i]) {

            } else {
                mini = test[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap1;
        int swap2;

        swap1 = array[index2];
        swap2 = array[index1];

        array[index1] = swap1;
        array[index2] = swap2;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }

}
