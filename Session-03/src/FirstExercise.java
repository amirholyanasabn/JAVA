import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text : ");
        String inputText = scanner.nextLine();

        System.out.println("Please enter your word for searching : ");
        String search = scanner.next();

        if (inputText.indexOf(search) == -1)
            System.out.println("not available");
        else if((inputText.indexOf(search)!=-1)&&(inputText.indexOf(search) == inputText.lastIndexOf(search)))
            System.out.println("One time");
        else
            System.out.println("More one time");

    }
}
