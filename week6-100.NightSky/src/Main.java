
public class Main {

    public static void main(String[] args) {
        // Test your code 
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");
        
        NightSky.print();
        System.out.println("Nmunber of stars: " + NightSky.starsInLastPrint());
    }
}
