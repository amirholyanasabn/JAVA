import java.util.Scanner;

public class WhileSecondDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text : ");
        String input = scanner.next().toLowerCase();
        while (true){
           if (input.equals("exit"))
               break;
           input = scanner.next();
//           else
//               input = scanner.next();
        }
    }
}
