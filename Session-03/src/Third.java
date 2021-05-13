import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = scanner.next();
        System.out.println("Please enter your age : ");
        int age = scanner.nextInt();
        float balance = 178.9087868334f;
        System.out.printf("Your name is %s and your age is %d your balance is %n",name,age);
        System.out.printf("Your balance is %.2f",balance);
    }
}
