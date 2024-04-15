/*Implement a password generator that takes command-line arguments to specify the length
of the password and which character sets to include (e.g., uppercase letters, lowercase
letters, numbers, special characters).*/
package lp2;
import java.util.Random;
public class exp2b {

    private static final char[] UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] NUMBERS = "0123456789".toCharArray();
    private static final char[] SPECIAL_CHARS = "!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?`~".toCharArray();

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java PasswordGenerator <length> [uppercase lowercase numbers special_chars]");
            return;
        }

        int length = Integer.parseInt(args[0]);
        String characterSets = args.length > 1 ? args[1] : "";

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        if (characterSets.contains("uppercase")) {
            password.append(UPPERCASE_LETTERS[random.nextInt(UPPERCASE_LETTERS.length)]);
        }
        if (characterSets.contains("lowercase")) {
            password.append(LOWERCASE_LETTERS[random.nextInt(LOWERCASE_LETTERS.length)]);
        }
        if (characterSets.contains("numbers")) {
            password.append(NUMBERS[random.nextInt(NUMBERS.length)]);
        }
        if (characterSets.contains("special_chars")) {
            password.append(SPECIAL_CHARS[random.nextInt(SPECIAL_CHARS.length)]);
        }

        for (int i = password.length(); i < length; i++) {
            char[] chars = characterSets.contains("uppercase") ? UPPERCASE_LETTERS :
                           characterSets.contains("lowercase") ? LOWERCASE_LETTERS :
                           characterSets.contains("numbers") ? NUMBERS :
                           characterSets.contains("special_chars") ? SPECIAL_CHARS :
                           UPPERCASE_LETTERS;
            password.append(chars[random.nextInt(chars.length)]);
        }

        System.out.println("Generated password: " + password.toString());
    }
}