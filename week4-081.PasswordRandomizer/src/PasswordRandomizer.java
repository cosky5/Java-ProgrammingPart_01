import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;
    private String alphabets = "abCdefgHi45jklmnopqr2stu3vwXyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int a = 0;
        int charPosition;
        String password = "";
        
        while(a < this.length){
        charPosition = random.nextInt(alphabets.length());
        password += alphabets.charAt(charPosition);
        a++;
         
    }
    return password;
    
    }
   
}

