
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number, i =1;
        // Write your code here
        System.out.println("Up to what number? ");
        number = reader.nextInt();
        
        while(i <= number){
            System.out.println(i);
            i++;
        }
        
    }
}
