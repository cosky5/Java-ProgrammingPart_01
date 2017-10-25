import java.util.Scanner;

public class Main {

    private static Object all;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        
        int input = 0;
        
        while(input != -1){
            input = reader.nextInt();
            
            if(input != -1){
                all.addNumber(input);
                if(input % 2 == 0){
                    even.addNumber(input);
                }else{
                    odd.addNumber(input);
                }
            }
        }
       
        System.out.println("sum: " + all.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
