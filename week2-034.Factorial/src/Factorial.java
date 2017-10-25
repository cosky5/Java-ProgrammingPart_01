import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int i = reader.nextInt();
         
        int number = 1;
        int factorial = 1;
        
        while(number <= i){
            factorial *= number;
            number++;
        }
        System.out.println("Factorial is " + factorial);

    }
}
