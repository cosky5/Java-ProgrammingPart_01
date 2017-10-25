
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double number = Double.parseDouble(reader.nextLine());
        
        System.out.println("Type another number: ");
        double number2 = Double.parseDouble(reader.nextLine());
        
        double result = number / number2;
        System.out.println("Division: "+number+"/"+number2+"="+result);
        
    }
}
