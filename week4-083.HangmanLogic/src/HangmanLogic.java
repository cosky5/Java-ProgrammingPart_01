
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if (this.guessedLetters.contains(letter)) {
            return;
        }
        if(!this.word.contains(letter)){
            this.numberOfFaults++;
        }
        this.guessedLetters += letter;
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        String hiddenword = "";
        int a = 0;
        String guessLetter = "";
        
        while(a < this.word.length()){
            char guess = this.word.charAt(a);
            guessLetter = Character.toString(guess);
            if(this.guessedLetters.contains(guessLetter)){
                hiddenword += guessLetter;
            }else{
                hiddenword += "_";
            }
            a++;
        }
        return hiddenword;
    }
}
