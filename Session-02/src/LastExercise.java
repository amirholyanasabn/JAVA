import java.util.Scanner;

public class LastExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number : ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber%2==0){
            if ((firstNumber>secondNumber || secondNumber%2!=0) && (firstNumber >thirdNumber || thirdNumber%2!=0))
                System.out.println("Max and Even is : "+firstNumber);
        }else if (secondNumber%2==0){
            if ((secondNumber >firstNumber || firstNumber%2!=0)&&(secondNumber>thirdNumber || thirdNumber%2!=0))
                System.out.println("Max and Even is : "+secondNumber);
        }else if (thirdNumber%2==0){
            if ((thirdNumber>firstNumber || firstNumber%2!=0) && (thirdNumber>secondNumber || secondNumber%2!=0))
                System.out.println("Max and Even is : "+thirdNumber);
        }else
            System.out.println("Not valid ... !");
    }

}
