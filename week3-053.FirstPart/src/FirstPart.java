
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String wordLength = reader.nextLine();
        
        System.out.println("Length of the first part: ");
        int userLength = reader.nextInt();
        
        System.out.println("Result: " + wordLength.substring(0, userLength));
    }
}
