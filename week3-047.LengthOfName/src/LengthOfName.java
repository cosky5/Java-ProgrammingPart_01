
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name: ");
        String userName = reader.nextLine();
        
        System.out.println("Number of characters: " + calculateCharacters(userName));
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text) {
        int number;
        number = text.length();
        return number;
    }
    
}
