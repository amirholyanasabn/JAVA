import java.util.Scanner;

public class ThirdExerciseDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number : ");
        int input = scanner.nextInt();

        if (input >0)
            System.out.println("Positive");
        if (input<0)
            System.out.println("negative");
        if (input%2==0)
            System.out.println("Even");
        if (input%2!=0)
            System.out.println("Odd");
        if (input >100)
            System.out.println("more than 100");
        if (input<100)
            System.out.println("less than 100");
    }
}
