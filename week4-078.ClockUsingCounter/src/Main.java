
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours   = new BoundedCounter(23);
        
        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        int a = 0;
        while(a < 121 ){
            System.out.println(hours + ":" + minutes +":"+seconds);
            if(seconds.getValue() == 59){
                if(minutes.getValue() == 59){
                    hours.next();
                }
                minutes.next();
                seconds.next();
            }else{
                seconds.next();
            }
            a++;
        }
        
    }
}
