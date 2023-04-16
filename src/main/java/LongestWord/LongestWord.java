package LongestWord;

import java.util.Arrays;
import java.util.Scanner;

public class LongestWord {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a list of words: ");
            String input = scanner.nextLine();
            String[] words = input.split("\\s+");
            String longest = Arrays.stream(words)
                    .max((a, b) -> Integer.compare(a.length(), b.length()))
                    .orElse("");
            System.out.println("Longest word: " + longest);
        }
    }