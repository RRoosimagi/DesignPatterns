package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int secretNumber;
    private int maxAttempts = 10;
    private int attemptsLeft;
    private boolean gameRunning = true;

    public GuessTheNumber() {
        Random rand = new Random();
        secretNumber = rand.nextInt(100) + 1;
        attemptsLeft = maxAttempts;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Guess The Number game!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! Let's play.");

        while (gameRunning) {
            System.out.println("1. Play game");
            System.out.println("2. Restart game");
            System.out.println("3. Exit game");
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    playGame(scanner, name);
                    break;
                case 2:
                    restartGame();
                    break;
                case 3:
                    gameRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        System.out.println("Thanks for playing!");
    }

    private void playGame(Scanner scanner, String name) {
        attemptsLeft = maxAttempts;
        System.out.println("I'm thinking of a number between 1 and 100 (inclusive).");
        System.out.println("You have " + attemptsLeft + " attempts to guess it.");

        while (attemptsLeft > 0) {
            System.out.print("Guess #" + (maxAttempts - attemptsLeft + 1) + ": ");
            int guess = scanner.nextInt();
            attemptsLeft--;

            if (guess == secretNumber) {
                System.out.println("Congratulations " + name + ", you guessed the number in " + (maxAttempts - attemptsLeft) + " attempts!");
                return;
            } else if (guess < secretNumber) {
                System.out.println("The number is higher. You have " + attemptsLeft + " attempts left.");
            } else {
                System.out.println("The number is lower. You have " + attemptsLeft + " attempts left.");
            }
        }

        System.out.println("Game over! The number was " + secretNumber);
    }

    private void restartGame() {
        System.out.println("Restarting game...");
        secretNumber = new Random().nextInt(100) + 1;
    }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        game.play();
    }
}

