
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);
        
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }
    
    public static int[] copy (int[] array){
        int[] test =  new int[array.length];
        for(int t = 0; t < array.length; t++){
            test[t] = array[t];
        }
        return test;
    }

    public static int[] reverseCopy(int[]array) {
        int[] test = new int[array.length];
        for (int t = 0; t < array.length; t++) {
            test[t] = array[array.length - t - 1];
         }
     return test; 
    }
     
}
