import java.util.Scanner;

public class EvenOoPositiveDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int input = scanner.nextInt();

        if(input%2==0 || input>0)
            System.out.println("Ok");
        else
            System.out.println("NoKey ");
    }
}
