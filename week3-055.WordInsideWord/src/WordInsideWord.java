
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first word: ");
        String usedWord1 = reader.nextLine();
        
        System.out.println("Type the second word: ");
        String usedWord2 = reader.nextLine();
        
        if(usedWord1.indexOf(usedWord2) >= 0){
            System.out.println("The word " + usedWord2 + " is found in the word " + usedWord1);
        }else{
            System.out.println("The word " + usedWord2 + " is not found in the word " + usedWord1);
        }
        
    }
}
