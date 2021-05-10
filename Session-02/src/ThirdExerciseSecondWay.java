import java.util.Scanner;

public class ThirdExerciseSecondWay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int number = scanner.nextInt();

        if (number > 0 )
            System.out.println("Positive");
        else
            System.out.println("Negative");
        if (number %2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        if (number > 100)
            System.out.println("More than 100");
        else
            System.out.println("Less than 100");
    }
}
