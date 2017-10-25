import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String wordUsed = reader.nextLine();
        int wordLength = wordUsed.length();
        
        System.out.println("Length of the end part: ");
        int userLength = Integer.parseInt(reader.nextLine());
        String answer = wordUsed.substring(wordLength -(userLength));
        System.out.println("Result: " + answer);
    }
}
