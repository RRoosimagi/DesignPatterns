package Password;

import java.util.Random;
import java.util.Scanner;

public class Password {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter password length (minimum 10): ");
            int length = scanner.nextInt();
            scanner.close();

            if (length < 10) {
                System.out.println("Password length must be at least 10  ");
                return;
            }

            String password = generatePassword(length);
            System.out.println("Generated password: " + password);
        }

        public static String generatePassword(int length) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();

            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lower = "abcdefghijklmnopqrstuvwxyz";
            String digits = "0123456789";
            String allChars = upper + lower + digits;

            // Generate at least one uppercase letter, one lowercase letter, and one digit
            sb.append(upper.charAt(random.nextInt(upper.length())));
            sb.append(lower.charAt(random.nextInt(lower.length())));
            sb.append(digits.charAt(random.nextInt(digits.length())));

            // Fill the rest of the password with random characters
            for (int i = 0; i < length - 3; i++) {
                sb.append(allChars.charAt(random.nextInt(allChars.length())));
            }

            // Shuffle the password to randomize the order of the characters
            char[] passwordChars = sb.toString().toCharArray();
            for (int i = 0; i < passwordChars.length; i++) {
                int randomIndex = random.nextInt(passwordChars.length);
                char temp = passwordChars[i];
                passwordChars[i] = passwordChars[randomIndex];
                passwordChars[randomIndex] = temp;
            }

            return new String(passwordChars);
        }
    }
