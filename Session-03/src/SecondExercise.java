import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text : ");
        String text = scanner.nextLine();
        char[] chars = text.toCharArray();
        int i=chars.length-1;
        for (int j =i;j>=0;j--){
            System.out.print(chars[j]);
        }
    }
}
