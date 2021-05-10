import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int input = scanner.nextInt();

        switch (input%2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
            default:

                break;
        }
    }
}
