import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangPerson<guessedLetters> {
    //instance variables
    private String selectedWord;
    private static Scanner wordsFile;
    private static ArrayList<String> wordBank = new ArrayList<>();
    private boolean[] guessedLetters = new boolean[26];
    private int numberOfWrongs;
    private char letter;
    private boolean rightGuess = false;
    boolean hasNoDashes;

    //constructors
    public HangPerson(Scanner wordsFile) {
        while (wordsFile.hasNextLine()) {    //to print out the words from the datafile
            wordBank.add(wordsFile.nextLine());
        }
//        System.out.println(wordBank);
    }

    public void randomWord() {
        Random randomIndex = new Random();
        int index = randomIndex.nextInt(HangPerson.wordBank.size());
        this.selectedWord = HangPerson.wordBank.get(index);
//        System.out.println(index);
//        System.out.println(this.selectedWord);
    }

    public void displayGameIntro() {
        System.out.println("Welcome to the hangperson game...\n" +
                "To play, guess a letter to try to guess the word.\n" +
                "Every time you choose an incorrect letter another body part appears on the gallows.\n" +
                "If you guess the word before you're hung, you win :-)\n" +
                "If you get hung you lose :-(\n" +
                "Time to guess...\n");
    }

    public void play() {
        randomWord();
        while (numberOfWrongs <= 7) {
            displayHangman();
            numOfWrongs();
            wordSoFar();
            if (hasNoDashes) {
                System.out.println("Congratulations, you win!!!");
                break;
            } else if (numberOfWrongs == 7) {
                System.out.println("Too bad, you lose!\nThe word was: " + selectedWord);
                break;
            }
            getLetter();
        }
        resetPlay();
    }

    public void resetPlay() {
        numberOfWrongs = 0;
        guessedLetters = new boolean[26];
        rightGuess = false;
        hasNoDashes = false;
    }

    public void displayHangman() {
        if(numberOfWrongs == 0) {
            System.out.println("|-----|-\n|\n|\n|\n|\n|_________");
        }
        switch(numberOfWrongs) {
            case 1:
                System.out.println("|-----|-\n|     O \n|\n|\n|\n|_________");
                break;
            case 2:System.out.println("|-----|-\n|     O \n|     | \n|\n|\n|_________");
                break;
            case 3:
                System.out.println("|-----|-\n|     O \n|     |\n|     |\n|\n|_________");
                break;
            case 4:
                System.out.println("|-----|-\n|     O \n|    " + "\\" + "|\n|     |\n|\n|_________");
                break;
            case 5:
                System.out.println("|-----|-\n|     O \n|    " + "\\" + "|/\n|     |\n|\n|_________");
                break;
            case 6:
                System.out.println("|-----|-\n|     O \n|    " + "\\" + "|/\n|     |\n|    /\n|_________");
                break;
            case 7:
                System.out.println("|-----|-\n|     O \n|    " + "\\" + "|/\n|     |\n|    / " + "\\" + "\n|_________");
                break;
        }

    }

    public void getLetter() {       //also check if the letter is valid
        boolean valid = false;
        while (valid == false) {
            System.out.print("Choose a letter: ");
            Scanner sc = new Scanner(System.in);
            this.letter = sc.next().charAt(0);
            if (this.letter >= 'a' && this.letter <= 'z') {
                guessedLetters[this.letter - 'a'] = true;
                valid = true;
            } else {
                System.out.println("Invalid, don't you know your ABCs?");
            }
        }
        checkIfGuessed(this.letter);
        checkIfRight(this.letter);
    }

    public void checkIfGuessed(char letter) {
        System.out.print("Letters guessed already: ");
        for (int i = 0; i < guessedLetters.length; i++) {
            if (guessedLetters[i]) {
                System.out.print((char) (i + 'a') + "\n");
            }
        }
    }

    public boolean checkIfRight(char letter) {
        char[] selectedWordCharArray = this.selectedWord.toCharArray();
        int i;
        rightGuess = false;
        for (i = 0; i < selectedWordCharArray.length; i++) {
            if (this.letter == selectedWordCharArray[i]) { // the guess was right
                rightGuess = true;
//                selectedWordCharArray[i] = this.letter;
            }
        }
        if (!rightGuess) {
            numberOfWrongs += 1;
        }
        return rightGuess;
    }

    public void numOfWrongs() {
        System.out.println("Number of wrong guesses: " + numberOfWrongs);
    }

    public void wordSoFar() {
        char[] selectedWordCharArray = this.selectedWord.toCharArray();
        System.out.print("The word so far: ");
        int i;
        hasNoDashes = true;
        for (i = 0; i < selectedWordCharArray.length; i++) {
//            int currentLetter = selectedWordCharArray[i] - 'a';
//            if (guessedLetters[currentLetter]) {
            if (guessedLetters[selectedWordCharArray[i] - 'a']) {
                System.out.print(selectedWordCharArray[i]);
            } else {
                System.out.print("-");
                hasNoDashes = false;
            }
        }
         System.out.println();
    }
}

