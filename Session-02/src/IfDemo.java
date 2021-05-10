import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number : ");
        int input = scanner.nextInt();

        if (input>50)
            System.out.println("Bigger than 50");
        else if(input == 50)
            System.out.println("Not Equal 50");
        else
            System.out.println("Smaller than 50");
    }
}
