import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text : ");
        String text = scanner.nextLine();
        char[] chars = text.toCharArray();
        for (int i=chars.length;i>=0;i--){
            System.out.print(chars[i]);
        }
    }
}
