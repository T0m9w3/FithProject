import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        var numberGen = new Random();
        var hiddenNumber = numberGen.nextInt(10) + 1;
        var commandLineReader = new Scanner(System.in);
        var userGuess = commandLineReader.nextInt();
        while (true) {
            if (hiddenNumber == userGuess) {
                System.out.println("you guessed it! " + hiddenNumber + "was right");
                break;
            } else {
                System.out.println("Sorry " + userGuess + " was not my number");
                if (userGuess - hiddenNumber > 0)
                    System.out.println("Your guess was too high!");
                else
                    System.out.println("Your guess was too low!");
                System.out.println("Try again!");
                userGuess = commandLineReader.nextInt();
            }
        }
    }
}
