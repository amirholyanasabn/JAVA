import java.util.Scanner;

public class IfDemoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int input = scanner.nextInt();
        if(input!=50)
            System.out.println("Not Equal");
        else
            System.out.println("Equal");
    }
}
