
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int a = array.length;
        for(int i=0; i<a-1; i++){
            System.out.print(array[i] + ", ");
        }
        
        System.out.print(array[a-1]);
    }
}
