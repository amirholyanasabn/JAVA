import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text : ");
        String input = scanner.next().toLowerCase();
        while (!input.equals("exit")){
            System.out.println(input);
            System.out.println("Please enter your text : ");
            input = scanner.next().toLowerCase();
        }
        System.out.println("Your input word is \"exit\" and I say goodbye .");
//        do {
//            System.out.println("Please enter your text : ");
//            input = scanner.next();
//            System.out.println(input);
//        }while (!input.equals("exit") );
    }
}
