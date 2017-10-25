import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();
        int numberChar = name.length();
        

        String lastWord = "";
        int counter = 1;
        while (counter <= numberChar) {
            char charPosition = name.charAt(numberChar - counter);
            lastWord = lastWord + charPosition;
            counter++;
        }

        System.out.println("In reverse order: " + lastWord);
    }
}
