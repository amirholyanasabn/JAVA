import java.util.Scanner;

public class FourthExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int number = scanner.nextInt();

        if (number>0 && number<=10)
            System.out.println("10");
        else if (number >10 && number <=20)
            System.out.println("20");
        else if (number >20 && number <=30)
            System.out.println("30");

    }
}
