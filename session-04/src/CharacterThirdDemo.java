import java.util.Scanner;

public class CharacterThirdDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your text : ");
        String input = scanner.next();
        char[] chars = new char[input.length()];
        int sum = 0;
        int sumOfNotDigit = 0;
        chars = input.toCharArray();
        Character[] character = new Character[chars.length];

        for (int i = 0; i <chars.length ; i++) {
            character[i] = chars[i];
            if (Character.isDigit(chars[i]))
                sum += 1;
            else
                sumOfNotDigit += 1;
        }
        System.out.printf("The number of digit number equal to %d \n The number of string equal to %d",sum,sumOfNotDigit);
    }
}
