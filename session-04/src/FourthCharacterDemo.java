import java.util.Scanner;

public class FourthCharacterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your input : ");
        String input;
        boolean flag = true;
        while (flag){
            input = scanner.next();
            char[] chars = input.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                if (!Character.isDigit(chars[i])) {
                    System.out.println("False");
                    flag = false;
                    break;
                }
            }
        }

    }
}
