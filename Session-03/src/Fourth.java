import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number");
//        String input = scanner.next();
        int input = Integer.parseInt(scanner.next());
        System.out.println(input+1);
        //Integer to String
        String date = String.valueOf(input);

    }
}
