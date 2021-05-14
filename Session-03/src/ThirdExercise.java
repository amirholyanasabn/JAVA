import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter lower number : ");
        int lowerNumber = scanner.nextInt();
        System.out.println("Please enter higher number : ");
        int higherNumber =scanner.nextInt();

        if (lowerNumber<higherNumber){
            for (int i = lowerNumber;i<=higherNumber;i++)
            {
                if (i%2==0)
                    System.out.println(i);
            }
        }else
            System.out.println("Not valid");
    }
}
