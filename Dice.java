
// ******* Dice Game ********

/*rolling dice and printing out if you get snake eyes(two ones)*/


import java.util.Scanner;

public class Dice {
    int numberOfGuesses = 0;        // the number of rolls to get snake eyes

    public static void main(String[] args) {

        Dice diceObj = new Dice();
        diceObj.Menu();
    }

    void DiceRoll() {
        int dice1 = (int) (6 * Math.random() + 1);
        int dice2 = (int) (6 * Math.random() + 1);

        // condition for getting snake eyes and printing out the number rolls took to get snake eyes

        if (dice1 == 1 && dice2 == 1) {
            System.out.println(dice1 + " " + dice2);
            System.out.println("Congratulations! You guessed snake eyes in: " + numberOfGuesses + " tries.");

        } else {
            numberOfGuesses++;
            System.out.println(dice1 + " " + dice2);
        }
    }

    // Menu for the game

    void Menu() {
        int i;

        do {
            System.out.println("Would you like to roll?");
            System.out.println("1 - yes");
            System.out.println("2 - no");
            Scanner userInput = new Scanner(System.in);
            i = userInput.nextInt();

            switch (i) {
                case 1:
                    DiceRoll();
                    break;
                case 2:
                    System.out.println("bye");
                default:
            }
        } while (i != 2);

    }
}

