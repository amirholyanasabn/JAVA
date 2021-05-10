import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number : ");
        int secondNumber = scanner.nextInt();

        if(firstNumber > secondNumber)
            System.out.println("Max is : "+firstNumber);
        else if (firstNumber == secondNumber)
            System.out.println("Both of them is equal");
        else
            System.out.println("Max is : "+secondNumber);
    }
}
